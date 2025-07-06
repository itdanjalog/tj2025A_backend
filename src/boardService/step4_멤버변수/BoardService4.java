/*
BoardService2
    - 내용 과 작성자 로 구성된 게시물을 최대 100개 까지 저장하는 서비스 구축
    - 조건 : main함수 1개 와 배열은 최대2까지 사용 구현
    - 구축 : 게시물 쓰기 와 게시물 출력 기능 구현

[JAVA] 종합예제2 : boardService2 (배열 활용)
[ 목표 ]
    boardService1 에서 변수로 관리하던 게시물 데이터를 배열로 전환
[ 요구사항 ]
    1. 게시물 저장소 확장 (배열 도입)
        · String 타입의 배열 2개를 선언하여, '내용'과 '작성자'를 저장할 공간을 만듭니다.
        · String[] content = new String[100];
        · String[] writer = new String[100];
        · 이 배열들은 최대 100개의 게시물을 저장할 수 있습니다. (참고: String 배열은 생성 시 각 요소가 자동으로 null로 초기화됩니다.)
    2. 메인 프로그램 흐름 구현하기
        · for(;;) 무한루프를 사용하여 프로그램이 계속 실행되도록 합니다.
        · 사용자에게 1.게시물쓰기 | 2.게시물출력 메뉴를 보여주고, Scanner로 원하는 기능의 번호를 입력받습니다.
        · 기능 1: 게시물 쓰기 (배열 순회 및 저장)
            - 사용자로부터 '내용'과 '작성자'를 입력받습니다.
            - for문을 사용하여 0번 인덱스부터 99번 인덱스까지 순회합니다.
            - if문으로 현재 인덱스(content[i])가 null인지(비어있는지) 검사합니다.
            - 만약 비어있는 공간을 찾았다면, 해당 인덱스에 입력받은 내용과 작성자를 저장합니다.
            - 저장에 성공하면, 더 이상 빈 공간을 찾을 필요가 없으므로 break를 이용해 for문을 즉시 탈출합니다.
            - **boolean 타입의 스위치 변수(예: isSaved)**를 활용하여 저장 성공 여부를 판단합니다.
            - for문 시작 전에 false로 초기화합니다.
            - 저장에 성공하고 break 하기 직전에 true로 변경합니다.
            - for문이 끝난 후, 스위치 변수 값을 확인하여 "게시물 쓰기 성공" 또는 "게시물 쓰기 실패 : 빈공간이 없습니다." 메시지를 출력합니다.
        · 기능 2: 게시물 출력 (배열 전체 조회)
            - for문을 사용하여 0번 인덱스부터 99번 인덱스까지 전체 배열을 순회합니다.
            - if문으로 현재 인덱스(content[i])가 null이 아닌(게시물이 존재하는) 경우에만, 해당 인덱스의 작성자와 내용을 형식에 맞게 출력합니다.
[ 실행 예시 ]
============= My Community ================
  1.게시물쓰기 | 2.게시물출력
===========================================
선택 > 1
내용 : 배열은 편리해요
작성자 : 유재석
[안내] 게시물 쓰기 성공

============= My Community ================
  1.게시물쓰기 | 2.게시물출력
===========================================
선택 > 1
내용 : 반복문과 함께 사용!
작성자 : 강호동
[안내] 게시물 쓰기 성공

============= My Community ================
  1.게시물쓰기 | 2.게시물출력
===========================================
선택 > 2
=============== 게시물 목록 =================
작성자 : 유재석 , 내용 : 배열은 편리해요
작성자 : 강호동 , 내용 : 반복문과 함께 사용!
===========================================


*/
package boardService.step4_멤버변수;

import java.util.Scanner;

class Board {
    String content;
    String writer;
}

public class BoardService4 {
    public static void main(String[] args) { // main start
        // [5] 클래스 만들기 , 객체 생성 , 게시물 객체 3개를 생성
        Board board1 = new Board();	Board board2 = new Board(); Board board3 = new Board();
        while(true) { 								// [1] 반복문 , while , while(true){ } 무한루프
            System.out.print("1.등록 2.출력 : "); 		// [2] 출력함수 , println
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt(); 			// [3] 입력함수 , Scanner ,
            // [4] 조건문 , if , 코드의 흐름제어
            if( choose == 1 ) { System.out.println(">> 등록 선택했습니다.");
                System.out.print("> 내용 : "); 		String content = scan.next();
                System.out.print("> 작성자 : ");		String writer = scan.next();
                if( board1.content == null ) { // [6] 첫번째 객체의 내용물이 비어 있으면 대입
                    board1.content = content; board1.writer = writer;
                }else if( board2.content == null  ) {
                    board2.content = content; board2.writer = writer;
                }else if( board3.content == null ) {
                    board3.content = content; board3.writer = writer;
                }
            } // if end
            else if( choose == 2 ) { System.out.println(">> 출력 선택했습니다.");
                if( board1.content != null ) {
                    System.out.println("/내용:" + board1.content + "/작성자:"+board1.writer );
                }
                if( board2.content != null ) {
                    System.out.println("/내용:" + board2.content + "/작성자:"+board2.writer );
                }
                if( board3.content != null ) {
                    System.out.println("/내용:" + board3.content + "/작성자:"+board3.writer );
                }
            } // elseif end
        } // w end
    } // main end
}
