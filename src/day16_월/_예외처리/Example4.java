package day16_월._예외처리;

// 1. Exception 클래스를 상속받아 사용자 정의 예외 클래스를 선언합니다.
class MyException extends Exception {
    // 2. 예외 메시지를 받는 생성자를 정의합니다.
    MyException(String message) {
        super(message); // 부모 클래스(Exception)의 생성자를 호출합니다.
    }
}

public class Example4 {

    // 3. 특정 조건에서 예외를 발생시키는(throw) 메소드를 선언합니다.
    //    발생 가능성이 있는 예외를 throws 키워드로 명시합니다.
    public static void checkNumber(int number) throws MyException {
        if (number < 0) {
            // 조건이 맞으면, 직접 만든 예외 객체를 생성하여 던집니다.
            throw new MyException("음수는 허용되지 않습니다.");
        }
        System.out.println("정상적인 숫자입니다: " + number);
    }

    public static void main(String[] args) {
        try {
            // 4. 예외 발생 가능성이 있는 메소드를 try 블록 안에서 호출합니다.
            checkNumber(10);
            checkNumber(-5); // 여기서 MyException이 발생합니다.

        } catch (MyException e) {
            // 5. catch 블록에서 직접 만든 예외를 잡아서 처리합니다.
            System.out.println("사용자 정의 예외 발생: " + e.getMessage());
        }
    }

}
