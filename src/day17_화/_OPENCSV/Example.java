package day17_화._OPENCSV;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Example {
    // https://mvnrepository.com/artifact/net.sf.opencsv/opencsv/2.3
    public static void main(String[] args) {
        String path = "src/day16/인천광역시 부평구_맛있는 집.csv";
        try {
            // 2. try 블록 내에서 객체를 생성합니다.
            // EUC-KR 인코딩으로 파일을 읽습니다. // 1. CSVReader 객체를 try 블록 외부에서 선언하고 null로 초기화합니다.
            CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));
            List<String[]> allData = reader.readAll();

            for (int i = 0; i < allData.size(); i++) {
                String[] row = allData.get(i);
                if (row.length > 3) {
                    System.out.printf("업소명 : %s , 지정메뉴 : %s \n", row[1], row[3]);
                }
            }
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
