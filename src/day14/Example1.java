package day14;

class 상위클래스{
    int value1 = 10;    int value2 = 20; // 멤버변수
    상위클래스(){ System.out.println("[상위클래스 인스턴스생성]");} // 생성자
    void showValue(){  //메소드
        System.out.println(">>상위클래스의 메소드 실행<<");
    } // func end
} // class end

class 하위클래스 extends 상위클래스 { // 클래스B extends 클래스A{ }
    int value3 = 30;    int value2 = 40;
    하위클래스(){ System.out.println("[하위클래스 인스턴스생성]"); }
    void showValue2(){ // 메소드
        System.out.println(">>하위클래스의 메소드 실행<< ");
    }
}

public class Example1 {
    public static void main(String[] args) {

    } // main end
} // class end













