package day17_화._OPENCSV;

import au.com.bytecode.opencsv.CSVReader;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Example {
    // https://mvnrepository.com/artifact/net.sf.opencsv/opencsv/2.3

    public static void main(String[] args) {
        String path = "src/day16/인천광역시 부평구_맛있는 집.csv";
        try {

            FileReader fileReader = new FileReader( path , Charset.forName("EUC-KR") );
            CSVReader reader = new CSVReader(   fileReader  );

            List<String[]> allData = reader.readAll();

            for (int i = 0; i < allData.size(); i++) {
                String[] row = allData.get(i);
                System.out.printf("업소명 : %s , 지정메뉴 : %s \n", row[1], row[3]);
            }
        } catch (IOException e) {
            System.out.println("파일 처리 중 오류가 발생했습니다.");
        }
    }

}
