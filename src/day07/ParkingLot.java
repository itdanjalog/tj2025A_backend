package day07;

public class ParkingLot {
    // 메소드/API 설계
    // 1. 함수명 : calculateFee
    // 2. 매개변수 : 주차 시간(분) , int time
    // 3. 반환값 :  최종 주차 요금 , int money
    int calculateFee( int time ){
        int money = 0;
        // 이것저것
        if( time<= 30 ){ money = 1000; }
        else{    money = ( ( time -30 ) / 10 * 500 ) + 1000 ;  }
        money = money >= 20000 ? 20000 : money;

        return money;
    } // func end
} // class end

