package day08;
public class BankAccount {
    // 멤버변수
    String accountNumber;       // 계좌번호
    String ownerName;           // 계좌주
    int balance;                // 입금잔액
    // 생성자
    BankAccount( String accountNumber, String ownerName, int balance ){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    // 메소드
    // 1) 입금 : 잔액에 입금액 더한다.
    // 메소드명 : deposit
    // 매개변수 : 입금액                int money
    // 리턴값 : 잔액 = int vs 성공/실패 = boolean
    boolean deposit( int money ){
        balance += money; // 입금잔액에 입금액을 누적 더하기 한다.
        return true; //  true 이면 성공 의미 부여해서 를 반환한다.
    } // func end
    // 2) 출금 : 잔액에 출금액 뺀다.
    // 메소드명 : withdraw
    // 매개변수 : 출금액               int money
    // 리턴값 : 잔액 = int vs 성공/실패 = boolean
    int withdraw( int money ){
        balance -= money;   // 입금잔액에 입금액을 누적 빼기 한다.
        return balance;     // 계산후 입금잔액을 반환한다.
    } // func end
} // class end
