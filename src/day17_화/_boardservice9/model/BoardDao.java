package day17_화._boardservice9.model;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    // 파일 경로를 상수로 관리하면 유지보수가 편리합니다.
    private static final String FILE_PATH = "./src/day17_화/_boardservice9/data.csv";
    // 싱글톤
    private static final BoardDao instance = new BoardDao();
    private BoardDao() { csvOpen(); }
    public static BoardDao getInstance() {
        return instance;
    }
    private void csvOpen(){
        File file = new File(FILE_PATH);
        if (file.exists()) {
            fileLoad(); // 파일이 존재하면 데이터를 불러온다.
        } else {
            try {
                file.createNewFile(); // 파일 생성
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 여러 게시물 저장하는 리스트
    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // 1. 게시물 등록
    public boolean boardWrite(BoardDto boardDto) {
        boardDB.add(boardDto);
        fileSave(); // 리스트에 추가 후 파일에 저장
        return true;
    }

    // 2. 게시물 출력
    public ArrayList<BoardDto> boardPrint() {
        return boardDB;
    }

    // =================== [변경] OpenCSV를 사용한 파일 저장 ======================== //
    public void fileSave() {
        // try-with-resources 구문으로 CSVWriter를 안전하게 사용
        try {
            CSVWriter writer = new CSVWriter(new FileWriter(FILE_PATH) );
            // boardDB에 있는 모든 BoardDto 객체를 String[] 리스트로 변환
            List<String[]> data = new ArrayList<>();
            for (BoardDto dto : boardDB) {
                // DTO의 필드를 String 배열로 만듭니다. 비밀번호(int)는 String으로 변환합니다.
                String[] row = {
                        dto.getContent(),
                        dto.getWriter(),
                        String.valueOf(dto.getPwd())
                };
                data.add(row);
            }
            // 변환된 데이터 리스트를 CSV 파일에 한 번에 씁니다.
            writer.writeAll(data);
            writer.close();
        } catch (IOException e) {
            System.out.println(">> [오류] 파일 저장 실패: " + e.getMessage());
        }
    }

    // =================== [변경] OpenCSV를 사용한 파일 불러오기 ======================= //
    public void fileLoad() {
        // try-with-resources 구문으로 CSVReader를 안전하게 사용
        try{
            CSVReader reader = new CSVReader(new FileReader(FILE_PATH));
            // CSV 파일의 모든 데이터를 한번에 읽어옵니다.
            List<String[]> allData = reader.readAll();
            // 불러온 데이터로 boardDB를 새로 채우기 전에 기존 데이터를 비웁니다.
            boardDB.clear();
            // 읽어온 String[] 리스트를 다시 BoardDto 객체로 변환
            for (String[] row : allData) {
                if (row.length >= 3) { // 데이터가 올바른지 간단히 확인
                    String content = row[0];
                    String writer = row[1];
                    int pwd = Integer.parseInt(row[2]); // 비밀번호(String)는 int로 변환
                    BoardDto boardDto = new BoardDto(content, writer, pwd);
                    boardDB.add(boardDto);
                }
            }
            reader.close();
        } catch (Exception  e) {
            System.out.println(">> [오류] 파일 불러오기 실패: " + e.getMessage());
        }
    }

}









