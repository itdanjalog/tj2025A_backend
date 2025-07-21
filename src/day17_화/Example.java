package day17_화;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // 예제2 : OpenCSV 라이브러리를 사용하여 공공데이터 CSV 파일 다루기
        String path = "src/day16/인천광역시 부평구_맛있는 집.csv";

        // try-with-resources 구문을 사용하여 리소스를 자동을 해제합니다.
        try (
                // EUC-KR 인코딩으로 파일을 읽기 위해 InputStreamReader를 사용합니다.
                CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))
        ) {
            // CSV 파일의 모든 데이터를 한번에 List<String[]> 형태로 읽어옵니다.
            List<String[]> allData = reader.readAll();

            // 첫 번째 행(헤더)을 건너뛰고 싶다면 i=1 부터 시작합니다.
            // 여기서는 모든 행을 출력하기 위해 i=0 부터 시작합니다.
            for (int i = 0; i < allData.size(); i++) {
                String[] row = allData.get(i); // 한 행(row)의 데이터를 가져옵니다.

                // 데이터가 비어있는 행을 건너뛰기 위한 검증
                if (row.length > 3) {
                    // 업소명은 2번째 열(index 1), 지정메뉴는 4번째 열(index 3)에 있습니다.
                    System.out.printf("업소명 : %s , 지정메뉴 : %s \n", row[1], row[3]);
                }
            }

        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
            e.printStackTrace();
        } catch (CsvException e) {
            System.out.println("CSV 데이터를 파싱하는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
