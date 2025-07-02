/*
BoardService2
    - 내용 과 작성자 로 구성된 게시물을 최대 100개 까지 저장하는 서비스 구축
    - 조건 : main함수 1개 와 배열은 최대2까지 사용 구현
    - 구축 : 게시물 쓰기 와 게시물 출력 기능 구현


[JAVA] 실습8 : 게시판 만들기 (배열 활용)
[ 목표 ]
실습6에서 변수로 관리하던 게시물 데이터를 배열로 전환하여, 보다 효율적이고 확장성 있는 프로그램을 구현합니다. for 반복문을 이용한 배열 순회 및 데이터 처리에 대한 이해를 심화합니다.

[ 요구사항 ]

게시물 저장소 확장 (배열 도입)

String 타입의 배열 2개를 선언하여, '내용'과 '작성자'를 저장할 공간을 만듭니다.

String[] content = new String[100];

String[] writer = new String[100];

이 배열들은 최대 100개의 게시물을 저장할 수 있습니다. (참고: String 배열은 생성 시 각 요소가 자동으로 null로 초기화됩니다.)

메인 프로그램 흐름 구현하기

for(;;) 무한루프를 사용하여 프로그램이 계속 실행되도록 합니다.

사용자에게 1.게시물쓰기 | 2.게시물출력 메뉴를 보여주고, Scanner로 원하는 기능의 번호를 입력받습니다.

기능 1: 게시물 쓰기 (배열 순회 및 저장)

사용자로부터 '내용'과 '작성자'를 입력받습니다.

for문을 사용하여 0번 인덱스부터 99번 인덱스까지 순회합니다.

if문으로 현재 인덱스(content[i])가 null인지(비어있는지) 검사합니다.

만약 비어있는 공간을 찾았다면, 해당 인덱스에 입력받은 내용과 작성자를 저장합니다.

저장에 성공하면, 더 이상 빈 공간을 찾을 필요가 없으므로 break를 이용해 for문을 즉시 탈출합니다.

**boolean 타입의 스위치 변수(예: isSaved)**를 활용하여 저장 성공 여부를 판단합니다.

for문 시작 전에 false로 초기화합니다.

저장에 성공하고 break 하기 직전에 true로 변경합니다.

for문이 끝난 후, 스위치 변수 값을 확인하여 "게시물 쓰기 성공" 또는 "게시물 쓰기 실패 : 빈공간이 없습니다." 메시지를 출력합니다.

기능 2: 게시물 출력 (배열 전체 조회)

for문을 사용하여 0번 인덱스부터 99번 인덱스까지 전체 배열을 순회합니다.

if문으로 현재 인덱스(content[i])가 null이 아닌(게시물이 존재하는) 경우에만, 해당 인덱스의 작성자와 내용을 형식에 맞게 출력합니다.

[ 실행 예시 ]

============= My Community v2.0 =============
  1.게시물쓰기 | 2.게시물출력
===========================================
선택 > 1
내용 : 배열은 편리해요
작성자 : 유재석
[안내] 게시물 쓰기 성공

============= My Community v2.0 =============
  1.게시물쓰기 | 2.게시물출력
===========================================
선택 > 1
내용 : 반복문과 함께 사용!
작성자 : 강호동
[안내] 게시물 쓰기 성공

============= My Community v2.0 =============
  1.게시물쓰기 | 2.게시물출력
===========================================
선택 > 2
============= 게시물 목록 =============
작성자 : 유재석 , 내용 : 배열은 편리해요
작성자 : 강호동 , 내용 : 반복문과 함께 사용!
===========================================


*/
package boardService.step2;

import java.util.Scanner;

public class BoardService2 {
    public static void main(String[] args) { // main start
        Scanner scan = new Scanner(System.in);
        // BoardService1 에서 변수를 사용했는데 배열변수를 사용하는이유
        // - 여러개의 변수에 있는 데이터를 배열로 사용하면 관리가 편하다.
        // 배열이란 ? 여러개의 동일한 타입의 데이터들을 *하나의 변수*에 저장할수 있는 (참조)타입
        // 인덱스이란 ? 배열내 저장된 데이터들의 저장 순서 번호 , 0 ~ 최대길이
        // 반복문 활용 : 시작값부터 끝값까지 반복
        String[] content = new String[100]; // 배열선언 방법 : 타입[] 변수명 = new 타입[개수];
        String[] writer = new String[100];  // String 데이터 100개를 저장할수 있는 배열 선언

        while(true){ // w start
            System.out.print("1.게시물 쓰기 2.게시물 출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ){
                System.out.print("새로운 게시물 제목: "); String cont = scan.next();
                System.out.print("새로운 게시물 작성자: "); String writ = scan.next();
                // 만약에 게시물이 비어 있으면 , 게시물이 100개이면 if 100개검사??? X
                // 인덱스 0부터 마지막인덱스 99 까지 1씩 증가
                // - 스위치변수=상태 저장하는 변수
                boolean save = false; // 처음에는 false 해서 저장 실패 했는 뜻
                for( int index = 0 ; index <= content.length-1 ; index++ ){
                    if( content[index] == null ){ //  만약에 index번째 게시물이 비어 있으면
                        content[index] = cont; writer[index] = writ; // 비어 있는 게시물의 입력받은 내용물 저장
                        save = true; // 만약에 저장 성공 했으면 save 변수에 true 값으로 변경
                        break; // 만약에 저장을 했으면 1개 저장해야 하므로 break 해서 반복문 종료 .
                    } // if end
                } // for end
                // for 종료후에 save 변수값이 true 성공 , false 이면 실패
                if( save ){   System.out.println("게시물 쓰기 성공");    }
                else{ System.out.println("게시물 쓰기 실패 : 빈공간이 없습니다.");  }
            } // if end

            if( choose == 2 ){
                for( int index = 0 ; index <= content.length-1 ; index++  ){ // 0~99 까지
                    if( content[index] !=null ){ // 만약에 index번째 게시물이 존재하면
                        System.out.printf("작성자 : %s , 내용 : %s \n" , writer[index] , content[index] );
                    } // if end
                } // for end
            } // if end
        } // while end
    } // main end
}
