package 종합.예제3; // 패키지 명

import java.util.Scanner;

public class BoardService3 { // 클래스 시작
    public static void main(String[] args) { // main함수 시작

        // (5)
        // boardService1_변수활용 : 게시물3개 --> 변수6개 , 게시물100개 --> 변수 200개
        // boardService2_배열활용 : 게시물100개 -> 변수2개
            // String[] contents = new String[100];
            // String[] writers = new  String[100]; // 속성이 다양했을때 배열 개수가 많아진다.
        // boardService3_객체활용 : 게시물100개 -> 변수2개(객체화) -> 변수1개
            // 1. 다양한 속성을 하나의 클래스로 설계하자. content 와 writer 를 하나의 객체
            // 2. 설계한 클래스/타입 으로 배열 선언
        Board[] boards = new Board[100];
            // boards 변수에 Board객체 100개를 저장 가능한 배열자료1개 저장
        for( ; ; ) {                                                        // (1) 무한루프
            System.out.println("============= My Community ============="); // (2) 출력
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner( System.in );                        // (3) 입력객체 생성
            int choose = scan.nextInt();
            if( choose == 1 ){                                              // (4) '1'번 입력시
                System.out.print("내용 : ");      String content = scan.next(); // (6) 입력받은 값을 각 변수에 저장
                System.out.print("작성자 : ");     String writer = scan.next();
                Board board = new Board();        // (6) 객체생성하여 입력받은 값을 멤버변수 대입
                board.content = content;
                board.writer = writer;
                boolean check = false; // true : 저장성공 , false : 저장실패
                for( int index = 0 ; index <= boards.length -1 ; index++ ){ // (6) 배열내 빈공간을 찾아서 빈공간에 객체 대입
                    if( boards[index] == null ){ // index번째 요소가 비어(null) 있으면
                        boards[index] = board; // 해당 index번째 요소의 생성한 객체를 대입한다.
                        check = true; // 상태변경
                        break; // 목표 이뤘으니 반복문 종료
                    } // if end
                } // for end
                if( check ){ System.out.println("[안내] 글쓰기 성공"); } // (6) 안내
                else{ System.out.printf("[경고] 게시물을 등록할 공간이 부족합니다."); }

            }else if( choose == 2 ) {                                           // (4) '2'번 입력시
                System.out.println("============= 게시물 목록 =============");
                for( int index = 0 ; index <= boards.length - 1 ; index++  ){   // (7) 배열내 요소(Board객체) 가 비어있지 않으면 board객체 출력하시오.
                    Board board = boards[index]; // index번째 요소 값(객체) 호출
                    if( board != null ){ // index번째 요소 (객체)가 비어 있지 않으면
                        System.out.println("작성자 : " +board.writer  );
                        System.out.println("내용 : " + board.content );
                        System.out.println("------------------------------------------");
                    } // if end
                } // for end
            } // if end

        } //for end // 무한루프 종료
    } // main 시작 끝
} // 클래스 끝
// step1: 반복적인 메인(화면) 출력 , 입력
// step2: 입력 선택에 따른 화면 출력
// step3: 기능별 필요한 메모리 설계
// step4: 각 기능별 세부 코드 구현