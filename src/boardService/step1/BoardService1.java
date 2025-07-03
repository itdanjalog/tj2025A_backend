/*
[JAVA] 종합예제1 : boardService1 (변수 활용)
[ 목표 ] Scanner, for(;;), if 문과 변수를 활용하여, 최대 3개의 게시물을 저장하고 조회할 수 있는 간단한 콘솔 게시판 프로그램을 구현합니다.
[ 요구사항 ]
    1. 게시물 저장 공간 만들기
        · 최대 3개의 게시물을 저장할 수 있어야 합니다.
        · 각 게시물은 '내용'과 '작성자' 정보를 가집니다.
        · 총 6개의 String 변수를 선언하여 저장 공간을 만드세요. (예: content1, writer1, content2, writer2, content3, writer3)
        · 모든 변수는 null로 초기화하여, 해당 공간이 비어있음을 나타내도록 합니다.
    2. 메인 프로그램 흐름 구현하기
        · 프로그램은 사용자가 강제 종료하기 전까지 계속 실행되어야 합니다. for(;;) 무한루프를 사용하세요.
        · 무한루프 안에서 사용자에게 메뉴를 보여주고, Scanner를 통해 원하는 기능의 번호를 입력받으세요.
        · 기능 1: 게시물 쓰기 (입력값: 1)
            - 사용자가 1을 입력하면, "내용 : "과 "작성자 : "를 순서대로 물어보고 입력받습니다.
            - 1번 게시물 공간(content1)부터 순서대로 비어있는지(null인지) 확인합니다.
            - 가장 먼저 발견된 빈 공간에 입력받은 내용과 작성자를 저장하고 "[안내] 글쓰기 성공" 메시지를 출력합니다.
            - 만약 3개의 게시물 공간이 모두 차 있다면, "[경고] 게시물을 등록할 공간이 부족합니다." 라는 메시지를 출력합니다.
        · 기능 2: 게시물 출력 (입력값: 2)
            - 사용자가 2를 입력하면, 저장된 모든 게시물을 아래 형식으로 출력합니다.
            - 1번 게시물부터 3번 게시물까지, 저장 공간이 비어있지 않은(null이 아닌) 경우에만 출력합니다.
[ 실행 예시 ]
============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 1
내용 : 안녕하세요
작성자 : 유재석
[안내] 글쓰기 성공

============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 1
내용 : 반갑습니다
작성자 : 강호동
[안내] 글쓰기 성공

============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 2
============= 게시물 목록 =============
작성자 : 유재석
내용 : 안녕하세요
------------------------------------
작성자 : 강호동
내용 : 반갑습니다
------------------------------------

============= My Community =============
  1.게시물쓰기 | 2.게시물출력
========================================
선택 > 1
내용 : 테스트
작성자 : 이수근
[경고] 게시물을 등록할 공간이 부족합니다.

 */
package boardService.step1;

import java.util.Scanner;

public class BoardService1 {
    public static void main(String[] args) { // main start // 번역된 코드들을 실행하는 기능(main스레드) 포함
        Scanner scan = new Scanner(System.in); // - 입력 객체
        // - 저장소 설계 , 게시물1개당 내용과 작성자( 내용 2개 ) , 게시물3개면 내용 6개
        // 변수란? 하나의 데이터/주소값 를 저장하는 공간/메모리
        // 타입이란? 변수의 저장될 데이터/주소의 타입 , 데이터 분류 , 기본타입(7:int~double) VS 참조타입( 클래스,인터페이스,배열 )
        String content1 = null;   String writer1 = null;        // 첫번째 게시물 내용물들
        String content2 = null;   String writer2 = null;        // 두번째 게시물 내용물들
        String content3 = null;   String writer3 = null;        // 세번째 게시물 내용물들

        // if : 다중 if는 다중 조건의 다중 결과를 충족할수 있다. ,
        // if~else if : 다중 조건의 무조건 1개 결과를 충족한다.
        while( true ) { // 무한루프
            System.out.print("1.게시물쓰기 2.게시물출력 선택 : ");// 출력
            int choose = scan.nextInt(); // 입력
            if( choose == 1 ) { // 만약에 입력한 값이 1 이면 '게시물 쓰기' 구현
                // 게시물을 저장할 내용 입력 받기
                System.out.print("새로운 게시물 내용: "); String content = scan.next();
                System.out.print("새로운 게시물 작성자: "); String writer = scan.next();
                // 게시물을 작성할 공간이 있는지 체크 , 임의로 게시물이 존재하지 않는 뜻  null(객체없다뜻) 또는 ""
                if( content1 == null ){ // 만약에 첫번째 게시물의 정보가 비어있으면
                    content1 = content;   writer1 = writer; // 입력받은 값들을 첫번째 게시물 변수에 저장
                } // if end
                else if( content2 == null ) { // 만약에 두번째 게시물의 정보가 비어 있으면
                    content2 = content; writer2 = writer;
                } // else if end
                else if ( content3 == null ) {
                    content3 = content; writer3 = writer;
                }else{
                    System.out.println("게시물 쓰기 실패 : 빈공간이 없습니다.");
                } // else end
            } // if end
            else if ( choose == 2 ) { // 만약에 입력한 값이 2 이면 '게시물 출력' 구현

                if( content1 != null ) {// 만약에 첫번째 게시물의 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s \n" , writer1 , content1 );
                }
                if( content2 != null ) {// 만약에 두번째 게시물의 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s \n" , writer2 , content2 );
                }
                if( content3 != null ) {// 만약에 세번째 게시물의 존재하면
                    System.out.printf("작성자 : %s , 내용 : %s \n" , writer3 , content3 );
                }

            } // if end
        } // while end
    } // main end
}
