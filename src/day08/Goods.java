package day08;

public class Goods {
    // 1. 멤버변수
    String name;
    int price;
    // 2. 생성자
    // 1) 기본 생성자 : name은 "미정", price는 0으로 초기화
    Goods( ){
        name = "미정";    // "미정" 초기화
        price = 0;      //  0으로 초기화
    }
    // 2) 매개변수가 있는 생성자
    Goods( String name , int price ){ //오버로드
        // 매개변수와 멤버변수 이름이 같을경우. this 구분
        this.name = name;   // this.멤버변수
        this.price = price;
    }
    // 3. 메소드
} // class end
