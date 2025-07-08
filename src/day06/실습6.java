package day06;

import java.util.Arrays;
import java.util.Scanner;

public class 실습6 { // class start
    public static void main(String[] args) {
        //[문제 1] 배열 선언과 초기화 , 인덱스
        int[] numbers = { 10 , 20 , 30 , 40 , 50 }; // (1) int 타입의 배열 numbers를 선언과 동시에 초기화
        // vs int[] numbers = new int[5]; int 타입의 배열 numbers를 선언
        System.out.println( numbers[2] );  // (2) 배열의 2번 인덱스에 저장된 값을 콘솔에 출력하세요.

        //[문제 2] 배열 선언 , 인덱스 , Arrays.toString()
        String[] season = new String[3]; // (1) String 타입의 데이터를 3개 저장할 수 있는 배열 season을 new 키워드를 사용하여 생성
        season[0] = "봄";    // 각 인덱스에 "봄", "여름", "가을" 값을 순서대로 할당하세요.
        season[1] = "여름";
        season[2] = "가을";
        System.out.println( season );   // 배열의 주소값 출력
        System.out.println( Arrays.toString( season) );   // Arrays.toString()을 사용하여 배열의 모든 요소를 한 번에 출력하세요

        //[문제 3] 다음과 같은 과일 배열이 있습니다. for 반복문을 사용하여 배열의 모든 요소를 하나씩 콘솔에 출력하시오.
        String[] fruits = {"사과", "바나나", "포도", "딸기"};
        // (방법1) 일반 for문
        for( int index = 0 ; index <= fruits.length - 1 ; index++ ){ System.out.println( fruits[index] ); }
        // (방법2) 향상된 for문 , for( 배열타입 반복변수명 : 배열변수명 ) { }
        for( String fruit : fruits ){ System.out.println( fruit );  }

        // [문제 4] 다음 학생들의 점수가 담긴 배열이 있습니다. for 반복문을 사용하여 모든 점수의 합계와 평균을 계산하여 콘솔에 출력하시오.
        int[] scores = {85, 92, 78, 65, 95};
        double sum = 0; // 모든 점수 합계
        for( int score : scores ){
            sum += score; // 모든 점수를 누적합계
        } // for end
        System.out.println("합계:" + sum );
        System.out.println("평균:" + sum / scores.length );

        //[문제 5] 점수 배열에서 100점 만점자가 처음 나타나면, "100점 만점자를 찾았습니다!"라고 출력하고 반복문을 즉시 종료하는 프로그램을 작성하시오.
        int[] scores2 = {77, 82, 100, 54, 96};
        for( int score : scores2 ){
            if( score == 100 ){ System.out.println("100점 만점자를 찾았습니다!"); break; }// 만약에 배열내 요소가 100점이면 반복문 종료
        }//for end

        //[문제 6] 다음 배열에서 'A'형 혈액형을 가진 사람이 몇 명인지 for 반복문을 통해 세고, 그 수를 콘솔에 출력하시오.
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        int countA = 0; // "A"형 혈액형의 개수를 세는 변수
        for( String blood : bloodTypes ){
            if( blood.equals( "A" ) ){countA += 1; } // 만약에 배열내 요소가 "A" 이면 countA 변수 1 증가
        } // for end
        System.out.println("A혈액형 개수 : " + countA );

        // [문제 7] 주어진 숫자 배열에서 가장 큰 값을 찾아 콘솔에 출력하는 프로그램을 작성하시오.
        int[] numbers3 = {23, 5, 67, 12, 88, 34};
        int max = 0; // 가장 큰값을 저장하는 변수.
        for ( int number : numbers3 ){
            if( number >= max ){ max = number; } // 만약에 요소값이 max보다 크면 max에 요소값 대입
        } // for end

        //[문제 8] 향상된 for 문 사용하지 않은 이유. 재고의 index 필요해서
        String[] products = {"볼펜", "노트", "지우개"};
        int[] stock = {10, 5, 20};
        Scanner scan = new Scanner( System.in); // 1) 입력객체 생성하여 변수에 저장
        System.out.print(">>상품명 : ");        String name = scan.next(); // 2) 상품명 입력받아 변수에 저장
        System.out.print(">>구매수량 : ");      int count = scan.nextInt();
        int check = 0;  // 0 : 없는 제품 , 1:구매완료 , 2:재고부족
        for( int index = 0 ; index <= products.length - 1 ; index++ ){ // 3) 0부터 마지막인덱스까지 1씩 반복
            String product = products[index]; // 4) index번째 제품명 호출
            if( product.equals( name ) ){ // 5) 만약에 index번째 제품명과 입력받은 값이 같으면
                if( stock[index] >= count ){ // 6) 만약에 index번째 재고 보다 입력받은 재고가 이하 이면
                    stock[index] -= count; // 7) 재고 차감
                    check = 1; break; // 8) 상태변수 변경
                }else{
                    check = 2 ; break;
                } // if end
            } // if end
        } // for end
        // 9) 상태변수에 따른 출력문
        if( check == 0 ){ System.out.println(" 없는 제품 입니다. ");  }
        else if( check == 1 ){ System.out.println("구매 완료 ");  }
        else if( check == 2 ){ System.out.println("재고 부족 "); }


        //[문제 9] 주어진 영화 이름과 평점 배열을 이용하여, 각 영화의 평점을 별(★, ☆)로 시각화하여 출력하는 프로그램을 작성하시오.
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
        int[] movieRatings = {8, 4, 7, 6};
        for( int index = 0 ; index <= movieNames.length - 1 ; index++ ){ // [영화이름]
            String movie = movieNames[index]; // index번째 영화 이름 추출
            System.out.print( movie ); // index번째 영화 이름 출력
            for( int star = 1 ; star <=10 ; star++ ){ // [평점]
                // 만약에 index번째 평점이 현재 별보다 크거나 같으면 검은별 , 아니면 흰별
                if( star <= movieRatings[index] ){  System.out.print("★");}
                else{   System.out.print("☆");  }
            } // for2 end
            System.out.println(); // 줄바꿈 처리
        } // for end

        //[문제 10] 차량별 주차 시간 데이터가 주어졌을 때, 아래의 요금 규정에 따라 각 차량이 지불해야 할 최종 주차 요금을 계산하여 출력하시오.
        // (1) 자바 에서의 배열은 서로 다른 타입간의 데이터를 동일한 배열에 저장할 수 없다.
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"}; // String 타입 끼리
        int[] usageMinutes = {65, 30, 140, 420 };    // int 타입 끼리
        // (2) 배열의 순회
        int money = 0;
        for( int index = 0 ; index <= carNumbers.length - 1 ; index++ ){
            System.out.print( carNumbers[index] + "\t");         // 모든 차량 번호 출력
            // System.out.println( usageMinutes[index] );      // 모든 차량의 사용 시간
            if( usageMinutes[index] <= 30 ){ money = 1000; }
            else{   // 사용요금에 30분 빼고 (10분당) 나누기 10 (나머지 없음 : int/int -> int(몫) ) * 500원 +1000원
                money = ( ( usageMinutes[index] -30 ) / 10 * 500 ) + 1000 ;
            }
            money = money >= 20000 ? 20000 : money; // 만약에 금액이 2만원 초과이면 2만원 , 아니면 금액
            System.out.println( money +"원" );
        } // for end

//        (* 차량번호 와 이용시간 인덱스가 같다는 가정 )
//        요금 규정:
//        기본 요금: 최초 30분까지 1,000원
//        추가 요금: 30분 초과 시, 매 10분마다 500원씩 추가
//        일일 최대 요금: 20,000원 (아무리 오래 주차해도 20,000원을 초과할 수 없음)
//        선언 코드:
//        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
//        int[] usageMinutes = {65, 30, 140, 420};
//        출력 예시:
//        210어7125: 65분 주차, 최종 요금: 2500원
//        142가7415: 30분 주차, 최종 요금: 1000원
//        888호8888: 140분 주차, 최종 요금: 6500원
//        931나8234: 420분 주차, 최종 요금: 20000원

    } // main end
} // class end
