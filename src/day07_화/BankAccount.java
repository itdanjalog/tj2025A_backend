package day07_화;

// 은행 계좌 클래스 (메소드 활용 예시용)
public class BankAccount {
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
