package 종합.예제1;// 현재 클래스의 패키지/폴더명

// step1: 반복적인 메인(화면) 출력 , 입력
// step2: 입력 선택에 따른 화면 출력
// step3: 기능별 필요한 메모리 설계
// step4: 각 기능별 세부 코드 구현
import java.util.Scanner;

public class BoardService1 { // class start
    public static void main(String[] args) { // main start
        // (5) for밖에 선언 : 메모리 설계 , 게시물1개당 변수2개 , 총게시물3 = 변수6
        String content1 = null; String content2 = null; String content3 = null;
        String writer1 = null;  String writer2 = null;  String writer3 = null;

        for( ; ; ){ // (1) 무한루프 시작 // for start
            System.out.println("============= My Community ============="); // (2) 출력
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in);  // (3) 입력
            int choose = scan.nextInt();
            if( choose == 1 ) {                     // (4) 입력에 따른 출력 구현.
                System.out.println("내용 : ");
                System.out.println("작성자 : ");
                System.out.println("[글쓰기] 성공");
            }else if( choose == 2 ){
                System.out.println("============= 게시물 목록 =============");
                System.out.println( "작성자 : ");
                System.out.println( "내용 : ");
                System.out.println("------------------------------------");
            } // if end
        } // 무한루프 끝 for end
    } // main end
}// class end
