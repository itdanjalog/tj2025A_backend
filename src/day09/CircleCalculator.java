package day09;

public class CircleCalculator {
    // 1. 멤버변수
    final double PI = 3.14159;
    // 2. 생성자
    // 3. 메소드
    double printCircleArea (int 반지름){
        double 원넓이 = 반지름 * 반지름 * PI;
        System.out.println( 원넓이 );
        return 원넓이;
    } // func end
} // class end

