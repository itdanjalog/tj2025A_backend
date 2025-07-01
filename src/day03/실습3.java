package day03;

import java.util.Scanner;

public class 실습3 { // class s
    public static void main(String[] args) { // main s
        // *[공통변수] 입력객체를 선언하고, 모든 문제에서 scan(입력객체)변수를 재사용
        Scanner scan = new Scanner(System.in); // Scanner 꼭 자동완성 : import java.util.Scanner;

        // 문제1 : 최규호  // 1. 키보드로부터 각 입력받은 자료를 각(3개) int 변수에 저장
        /*
        System.out.print("국어 점수를 입력하세요. : "); int kor = scan.nextInt();
        System.out.print("영어 점수를 입력하세요. : "); int eng = scan.nextInt();
        System.out.print("수학 점수를 입력하세요. : "); int math = scan.nextInt();
        int sum = kor+eng+math;         // 2. 각 변수(3개) 더한 결과를 sum 변수에 저장한다.
        double aver = sum/3.0;          // 3. sum 변수에 나누기 과목수   //  [자동타입변환] int / int -> int   ,  int / double -> double
        System.out.printf("총점: %d\n",sum);
        System.out.printf("평균: %.1f\n",aver);
        */

        // 문제2 : 이원국
        /*
        System.out.print("반지름을 입력해주세요");  double r = scan.nextDouble();  // 1. 입력받은 자료를 double 변수에 저장

        double one = r * r * 3.14; // 2. 계산식 : double * double * 3.14(실수리터럴:double) -> double
        System.out.printf("원의 넓이: %.3f 입니다.\n", one); // 3. %f : 실수 , %.소수점자릿수f , 소수점 3번째 자릿수 까지 표현
        */

        // 문제3 : 이겨레
        /*
        System.out.print("첫번째 실수 : ");      double no1 = scan.nextDouble();
        System.out.print("두번째 실수 : ");      double no2 = scan.nextDouble();
        double result = (no1/no2)*100;      // 2. 계산식 : double/double -> double , double*int -> double
        System.out.println("비율 : " + result +"%" );
        */

        // 문제4 : 안정훈
        /*
        System.out.print("정수를 입력하세요 : ");
        int int1 = scan.nextInt();              // 1. 하나의 int값 입력받아 변수에 저장
        boolean odd = int1 % 2 == 1;            // 2. 짝수찾기 : 값%2 == 0 , 홀수찾기 : 값%2 == 1
        System.out.println("결과 : " + odd );    // * 임의값의 나누기 2를 했을때 나머지가 0이면 짝수 1이면 홀수
        */

        // 문제5 : 정은주
        /*
        System.out.print("정수:");
        int integer = scan.nextInt();             // 1. 하나의 int값 입력받아 변수에 저장
        System.out.println( integer % 7 == 0 );   // 2. 배수찾기 : 값%배수 == 0 , 임의값의 배수로 나눈 나머지가 0 이면 임의값은 그 배수
        */

        // 문제6 : 정유진
        /*
        System.out.print( "아이디: " );     String id = scan.next();   // 1. 하나의 String값 입력받아 변수에저장
        System.out.print( "비밀번호: " );   String pwd = scan.next();  // * 비밀번호/전화번호 등 문자열 권장
            // 2. JS방식  : id == "admin" && pwd == "1234"
            // 2. JAVA방식: id.equals("admin") && pwd.equals("1234")  , *문자열(객체)은 비교연산자 대신 함수 활용한다.
        System.out.println( id.equals("admin") && pwd.equals("1234") ); // 비교/논리 연산자의 결과는 true or false
        */

        // 문제7 : 최동진
        System.out.print("정수를 입력하세요 : ");     int i1 = scan.nextInt(); // 1. 하나의 정수를 입력받아 저장
        System.out.print("결과:");
        System.out.println(i1 % 2 == 1 && i1 % 7 == 0 ); // 2. 정수가 홀수 이면서 정수가 7의 배수, &&이면서

        // 문제8 : 민성호 : 삼항연산자 목적 : true 와 false 대신에 다른 자료로 변경
        System.out.print("1차점수 : ");            int score1 = scan.nextInt();
        System.out.print("2차 점수 : ");           int score2 = scan.nextInt();
        System.out.println( score1+score2 >= 150 ? "합격" : "불합격");

        // 문제9 : 신연우 : 삼항연산자 , 연결연산자 , .문자열비교
        System.out.print("이름을 입력하세요 : ");   String nameInput1 = scan.next();    // 1. 하나의 String(문자열) 입력받아 저장
        System.out.println( nameInput1.equals("유재석") ? nameInput1 + "(방장)" : nameInput1 );
                            // 삼항연산자 : 조건 ? 참 : 거짓
                            // 조건           : 만약에 입력값(nameInput1) 이 "유재석" 이면
                            // 참(true)       : 입력값(nameInput1) 뒤에 "(방장)" 문자열 +연결
                            // 거짓(false)    :  입력값(nameInput1)
        // 문제10 : 김진숙
        // 문제11 : 김재영
        // 문제12 : 박옥선
        // 문제13 : 신승민
        // 문제14 : 옹태경
        // 문제15 : 송지훈
        // 문제16 : 이찬영

    } // main e
} // class e

