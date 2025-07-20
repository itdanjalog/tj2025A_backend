package day16_월._파일처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step3 {
    public static void main(String[] args) {

        // [3] 활용 ( 메모장.txt) csv파일 :
            // 공공데이터포털 : https://www.data.go.kr
            // '부평구 맛집' 검색
            // 부평구 맛집 API 링크 : https://www.data.go.kr/data/15103411/fileData.do
            // DAY18 폴더내 '부평구맛집데이터.csv' 넣어두기

        try{
            // 1. 파일 읽기 객체 생성
            FileInputStream 파일읽기객체 = new FileInputStream("./src/day16_월/_파일처리/부평구맛집데이터.csv");
            // 2. 바이트 배열 선언
            byte[] bytes = new byte[6521];
            // 3. 파일 읽기
            파일읽기객체.read(  bytes );
            // 4. 확인
            String 파일내용 = new String( bytes , "EUC-KR" );
            System.out.println( 파일내용 );
            //활용
            System.out.println( 파일내용.split("\n")[0] );
            System.out.println( 파일내용.split("\n")[1] );
            System.out.println( 파일내용.split("\n")[1].split(",")[1] );
            // 첫번째 맛집 가게명 : (주)온누리푸드온누리장작구이
        }catch (Exception e ){
            System.out.println("[예외발생 관리자에게 문의]");
        }
    } // main end
} // class end










