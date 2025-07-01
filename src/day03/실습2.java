package day03; // 현재 .java 파일의 패키지/폴더 명

import java.util.Scanner;

public class 실습2 { // [컴파일/번역] 자바의 모든 코드는 클래스{} 안에서 작성해야한다. // class s
    // [실행] 자바의 실행 코드는 모두 main 함수 안에서 작성해야한다. , main + 엔터
    public static void main(String[] args) { // main s
        // 1. 자동타입변환
        byte a = 10;    // byte , int (변수에 저장가능한 메모리크기=타입)
        int b = 200;     // 'a' , 'b' (변수명은 메모리의 상징적인 이름)
        long c = a + b; // 변수명을 호출하면 변수값이 반환된다.
                // (byte)10 + (int)200 => (1.)자동타입변환 (int)210
                // long c = (int)210 , (2.)자동타입변환
        System.out.println( "1.결과: " + c ); // sout + 엔터

        // 2. 강제타입변환
        double z = 3.141592;
        System.out.println( "2.결과: " + (int)z );   // (변환할타입명)변수명

        // 3. 입력함수 :(1) 입력객체 : new Scanner( System.in ) (2) 입력객체 이용한 입력함수 : .next(); , .nextInt();
        Scanner scan = new Scanner( System.in ) ;   // (1) 입력객체 를 변수에 대입 , Scanner : 자동완성 입력
        System.out.print("이름을 입력하세요 : ");
        String name = scan.next();                  // (2) 입력객체 이용한 입력함수 , .next()
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();                   // (2) 입력함수가 반환한 값을 변수에 대입 ,
        System.out.printf("%s님의 나이는 %d세 입니다. \n" , name , age );

        // 4. 입력함수 : 3번에서 사용된 입력객체가 저장된 변수(scan) 를 그대로 사용가능!.
            // 변수란 ? 자료(값,객체,배열 등)를 여러번 사용
        // (1) 입력객체는 3번에서 선언된 변수를 재활용 하므로 생략
        System.out.print("게시물 번호: ");               // 1. 입력 받기전 안내문 출력
        int bno = scan.nextInt();                       // 2. 입력받은 값을 타입과 일치하여 변수에 저장
        System.out.print("제목: ");                      // 1.
        scan.nextLine();                                // * nextLine() 앞 코드에 다른 nextXXX() 존재했을때 문제점해결
        String title = scan.nextLine();                 // 2.
        System.out.print("내용: ");                      // 1.
        String content = scan.nextLine();               // 2.
        System.out.printf("[%d번 게시물] \n" , bno );    // 3. printf 활용한 서식출력 , %d정수 %s실수
        System.out.printf("제목 : %s \n" , title );     //  printf( "서식문자" , 변수/값 )
        System.out.printf("내용 : %s \n" , content );   //  \n 줄바꿈처리기능

        // 5. 입력함수 : 3번에서 사용된 입력객체가 저장된 변수(scan) 를 그대로 사용가능!.
        System.out.print("성별을 입력하세요(남/여) : ");  // * 문자 1개 입력함수는 없다.
        char gender = scan.next().charAt(0);            // .charAt(인덱스) : 인덱스 번째 문자1개 반환 함수
        System.out.printf("입력하신 성별은 %s 입니다. \n" , gender );

        // 6. 입력함수 , 강제타입변환
        System.out.print("키를 입력하세요: "); // 1. 입력전에 안내문구 출력
        double height = scan.nextDouble();  // 2. 입력받은 자료를(double) 반환함수. *자료타입에 일치하여 변수 선언
        System.out.printf("당신의 키는 약 %dcm 이군요." , (int)height ); // 3. (변환할타입명)변수명

        // 7. 입력함수
        System.out.print("이름 : ");                          String name2 = scan.next();
            // VS JS방식 : let name2 = prompt("이름 : ");
        System.out.print("나이 : ");                          int age2 = scan.nextInt();
            // VS JS방식 : let age2 = Number( prompt("나이 : ") );
        System.out.print("키 : ");                           double height2 = scan.nextDouble();
        System.out.print("프로그래머입니까? (true/false):");    boolean check2 = scan.nextBoolean();
        System.out.println("--- 자기소개 ---");
        System.out.println("이름 : " + name2 );
        System.out.println("나이 : " + age2 );
        System.out.println("키 : " + height2 +"cm");
        System.out.println("프로그래머 여부 : " + check2 );
    } // main e
} // class e


/*
문제 1: a 와 b 두 변수의 합을 long 타입의 변수에 저장하여 그 결과를 출력하시오.
선언 코드 :
byte a = 10;
int b = 200;
출력 예시:
결과: 210

문제 2: 실수 3.141592를 double 타입 변수에 저장한 뒤, 이 변수를 int 타입으로 강제 변환하여 정수 부분만 출력하시오.
선언 코드 :
double z = 3.141592;
출력 예시:
원본 double 값: 3.141592
변환된 int 값: 3

문제 3: Scanner를 이용하여 사용자의 이름(String)과 나이(int)를 입력받아, "OOO님의 나이는 OO세 입니다." 형식으로 출력하는 코드를 작성하시오.
입력 예시:
이름을 입력하세요: 유재석
나이를 입력하세요: 51
출력 예시:
유재석님의 나이는 51세 입니다.

문제 4: Scanner를 이용해 게시물 번호(int), 제목(String), 내용(String)을 순서대로 입력받아 출력하시오.
요구 조건: 제목과 내용은 띄어쓰기가 포함될 수 있으므로 nextLine()을 사용하시오.
입력 예시:
게시물 번호: 1
제목: 자바는 재미있어요
내용: 정말입니다. 다들 동의하시죠?
출력 예시:
[ 1번 게시물 ]
제목: 자바는 재미있어요
내용: 정말입니다. 다들 동의하시죠?

문제 5: Scanner를 이용해 성별을 한 글자('남' 또는 '여')로 입력받아 char 타입 변수에 저장하고, 입력된 성별을 출력하시오.
요구 조건: Scanner에는 nextChar() 함수가 없으므로 next().charAt(0)을 활용하시오.
입력 예시:
성별을 입력하세요(남/여): 남
출력 예시:
입력하신 성별은 '남' 입니다.

문제 6: Scanner를 이용해 사용자의 키를 double 타입(예: 178.5)으로 입력받은 후, 이 값을 int 타입으로 강제 변환하여 "당신의 키는 약 OOOcm 이군요." 라고 정수 부분만 출력하시오.
입력 예시:
키를 입력하세요: 178.5
출력 예시:
당신의 키는 약 178cm 이군요.

문제 7: Scanner를 사용하여 아래 4가지 정보를 순서대로 입력받아 출력하는 코드를 작성하시오.
이름 (String), 나이 (int), 키 (double), 프로그래머 여부 (boolean)
입력 예시:
이름: 김자바
나이: 25
키: 165.8
프로그래머입니까? (true/false): true
출력 예시:
--- 자기소개 ---
이름: 김자바
나이: 25
키: 165.8cm
프로그래머 여부: true
 */