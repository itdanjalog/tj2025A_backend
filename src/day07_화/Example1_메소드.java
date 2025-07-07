package day07_화;

/**
 * 자바 메소드 문법 마스터 클래스
 * 이 수업 자료는 객체의 '기능'을 담당하는 메소드(멤버 함수)의
 * 개념, 선언 방법, 그리고 다양한 활용법을 실생활 비유와 간단한 예제로 설명하여
 * 누구나 쉽게 이해할 수 있도록 설계되었습니다.
 */

// [1] 클래스 설계: 속성(멤버변수)과 기능(메소드) 정의
// 비유: 계산기 설계도. 계산기는 숫자(데이터)를 표시하고, '더하기', '빼기' 같은 '기능'을 수행합니다.
class Calculator {
    // --- 멤버 변수 (객체의 데이터/상태) ---
    boolean isPowerOn = false; // 전원 상태

    // --- 멤버 함수 / 메소드 (객체의 기능/행동) ---

    // 1. 매개변수 X, 반환값 X 메소드
    // - 단순히 정해진 동작만 수행합니다.
    // - 비유: 계산기의 'ON' 버튼. 누르면 그냥 켜지는 기능.
    void powerOn() {
        System.out.println("계산기 전원을 켭니다.");
        isPowerOn = true; // 객체의 멤버 변수(상태)를 변경
    }

    // 2. 매개변수 X, 반환값 O 메소드 (추가된 예제)
    // - 외부에서 데이터를 받지 않고, 가지고 있던 값을 호출한 곳으로 돌려줍니다.
    // - 비유: 계산기의 'π' 버튼. 누르면 저장된 원주율 값(3.14159...)을 화면에 보여주거나(반환) 합니다.
    double getPi() {
        return 3.14159;
    }

    // 3. 매개변수 O, 반환값 X 메소드
    // - 외부에서 데이터를 받아서(매개변수) 사용하지만, 결과를 돌려주지는 않습니다.
    // - 비유: "10과 20을 화면에 출력해줘" 라고 요청. 계산기는 결과를 화면에 보여줄 뿐, 값을 우리에게 주진 않습니다.
    void printSum(int x, int y) {
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있습니다. 전원을 먼저 켜주세요.");
            return; // 메소드를 즉시 종료
        }
        int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
    }

    // 4. 매개변수 O, 반환값 O 메소드
    // - 외부에서 데이터를 받아서(매개변수) 가공한 뒤, 그 결과를 호출한 곳으로 돌려줍니다(반환).
    // - 비유: "10과 20을 더한 값을 나에게 알려줘" 라고 요청. 계산기는 '30'이라는 결과값을 우리에게 돌려줍니다.
    int add(int x, int y) {
        if (!isPowerOn) {
            System.out.println("전원이 꺼져있습니다. 전원을 먼저 켜주세요.");
            return 0; // int 타입의 기본값인 0을 반환하고 종료
        }
        int result = x + y;
        return result; // 'return' 키워드로 결과값을 반환
    }

    // 5. 메소드 오버로딩 (Overloading)
    // - 같은 이름의 메소드를 매개변수의 타입이나 개수를 다르게 하여 여러 개 정의하는 것.
    // - 비유: '더하기' 기능은 정수 2개를 더할 수도, 실수 2개를 더할 수도 있습니다.
    double add(double x, double y) {
        return x + y;
    }
}

public class Example1_메소드  {

    public static void main(String[] args) {

        /*
         * =======================================================================
         * [ 파트 0. 왜 메소드(Method)가 필요할까요? - "객체는 행동한다!" ]
         * =======================================================================
         *
         * 클래스가 객체의 '속성(데이터)'을 정의한다면, 메소드는 객체의 '기능(행동)'을 정의합니다.
         * 메소드가 없다면 객체는 데이터를 담기만 하는 깡통에 불과합니다.
         *
         * [비유 1: 커피 머신]
         * - 속성(멤버변수) : 원두 종류, 물의 양, 우유 유무
         * - 기능(메소드)   : 전원켜기(), 에스프레소만들기(), 라떼만들기()
         *
         * 우리는 '라떼만들기()' 버튼만 누르면 됩니다. 복잡한 내부 동작은 알 필요가 없죠.
         * 이처럼 메소드는 복잡한 코드를 하나의 기능 단위로 묶어 재사용성을 높이고 코드를 간결하게 만듭니다.
         */

        System.out.println("--- [메소드 문법 마스터 클래스를 시작합니다!] ---");

        // --- 1. 객체 생성 및 메소드 호출 ---
        // 계산기(Calculator) 클래스로 실제 계산기 객체를 만듭니다.
        Calculator myCalc = new Calculator();

        // 1-1. 매개변수와 반환값이 없는 메소드 호출
        myCalc.powerOn(); // myCalc 객체의 powerOn() 기능을 실행

        // 1-2. 매개변수는 없고 반환값이 있는 메소드 호출 (추가된 예제)
        double piValue = myCalc.getPi();
        System.out.println("계산기에서 원주율 값 가져오기: " + piValue);

        // 1-3. 매개변수는 있고 반환값이 없는 메소드 호출
        myCalc.printSum(10, 20); // 10과 20을 전달하여 printSum() 기능을 실행

        // 1-4. 매개변수와 반환값이 모두 있는 메소드 호출
        // add(30, 50) 메소드가 실행되고, 그 결과(80)를 반환하여 result1 변수에 저장합니다.
        int result1 = myCalc.add(30, 50);
        System.out.println("add(30, 50)의 결과: " + result1);

        // 1-5. 메소드 오버로딩 확인
        // 같은 add 이름이지만, 실수를 전달했으므로 double을 처리하는 메소드가 자동으로 호출됩니다.
        double result2 = myCalc.add(3.14, 2.5);
        System.out.println("add(3.14, 2.5)의 결과: " + result2);


        // --- 2. 메소드 활용 예시 : 은행 계좌 관리 ---
        System.out.println("\n--- 2. 메소드 활용 예시 : 은행 계좌 ---");

        // BankAccount 클래스는 이 파일의 아래쪽에 정의되어 있습니다.
        BankAccount myAccount = new BankAccount();
        myAccount.owner = "유재석";
        myAccount.balance = 10000;

        System.out.println(myAccount.owner + "님의 초기 잔액: " + myAccount.checkBalance() + "원");

        // 입금(deposit) 메소드 호출
        myAccount.deposit(5000);
        System.out.println("5000원 입금 후 잔액: " + myAccount.checkBalance() + "원");

        // 출금(withdraw) 메소드 호출
        myAccount.withdraw(3000);
        System.out.println("3000원 출금 후 잔액: " + myAccount.checkBalance() + "원");

        // 잔액보다 큰 금액 출금 시도
        myAccount.withdraw(15000); // 출금 실패 메시지가 출력됩니다.
        System.out.println("잔액 초과 출금 시도 후 최종 잔액: " + myAccount.checkBalance() + "원");


        // ★★★ 결론: 메소드는 객체에 생명을 불어넣는 '행동'이며,
        // 복잡한 로직을 기능별로 캡슐화하여 코드의 가독성과 재사용성을 획기적으로 높여줍니다. ★★★
    }
}

// 은행 계좌 클래스 (메소드 활용 예시용)
class BankAccount {
    String owner;
    long balance;

    // 입금 기능
    void deposit(long amount) {
        balance += amount; // balance = balance + amount;
        System.out.println(amount + "원이 입금되었습니다.");
    }

    // 출금 기능
    void withdraw(long amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            return; // 돈이 부족하면 출금 처리를 하지 않고 메소드 종료
        }
        balance -= amount;
        System.out.println(amount + "원이 출금되었습니다.");
    }

    // 잔액 조회 기능
    long checkBalance() {
        return balance; // 현재 잔액(balance) 값을 호출한 곳으로 돌려줌
    }
}

