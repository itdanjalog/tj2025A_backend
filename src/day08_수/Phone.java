package day08_수;

// [1] 클래스 설계: 속성과 기능, 그리고 '생성자'
// 비유: 스마트폰 설계도. 스마트폰은 모델명(속성)을 가지며, 전화걸기(기능)를 할 수 있습니다.
//      '생성자'는 공장에서 스마트폰을 '처음 만들 때' 모델명을 각인시키는 작업과 같습니다.

public class Phone {
    // --- 멤버 변수 (속성) ---
    String model;
    String color;
    int price;

    // --- 생성자 (Constructor) ---
    // [조건] 1. 이름이 클래스명과 동일하다.  2. 반환타입이 없다.
    // [역할] 객체가 생성될 때(new) 자동으로 한 번 호출되어, 멤버 변수를 초기화하는 역할을 주로 합니다.

    // 1. 기본 생성자 (Default Constructor)
    // - 클래스 내에 생성자가 하나도 없으면, 컴파일러가 자동으로 아래와 같은 기본 생성자를 추가해줍니다.
    // - 개발자가 생성자를 하나라도 만들면, 기본 생성자는 자동으로 추가되지 않습니다.
    Phone() {
        System.out.println("[알림] Phone의 기본 생성자가 호출되었습니다.");
        model = "알뜰폰";
        color = "블랙";
        price = 100000;
    }

    // 2. 매개변수가 있는 생성자
    // - new 키워드로 객체를 생성할 때, 외부에서 값을 받아와 멤버 변수를 초기화합니다.
    // - 비유: "아이폰, 화이트 색상으로 만들어주세요" 라고 주문하는 것과 같습니다.
    Phone(String pModel, String pColor) {
        System.out.println("[알림] 매개변수 2개(모델, 색상) 생성자가 호출되었습니다.");
        // 'this' 키워드: 매개변수명과 멤버변수명이 같을 때, 'this.멤버변수'는 클래스의 멤버임을 명확히 알려줍니다.
        this.model = pModel;
        this.color = pColor;
        this.price = 1200000; // 가격은 고정값으로 초기화
    }

    // 3. 생성자 오버로딩 (Overloading)
    // - 메소드 오버로딩처럼, 매개변수의 개수나 타입을 다르게 하여 생성자를 여러 개 정의할 수 있습니다.
    Phone(String pModel, String pColor, int pPrice) {
        System.out.println("[알림] 매개변수 3개(모델, 색상, 가격) 생성자가 호출되었습니다.");
        this.model = pModel;
        this.color = pColor;
        this.price = pPrice;
    }

    // --- 메소드 (기능) ---
    void printInfo() {
        System.out.println("모델명: " + model + ", 색상: " + color + ", 가격: " + price + "원");
    }
}
