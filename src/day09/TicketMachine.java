package day09;

public class TicketMachine {
    // 1. 멤버변수
    static int totalTickets = 0; // 정적변수
    // 3. 메소드
    // 1) 인스턴스(객체) 메소드
    void issueTicket(){
        totalTickets++;
        System.out.println("티켓 1장을 발권했습니다.");
    }
    // 2) 정적 메소드
    static void printTotalTickets(){
        System.out.println( totalTickets );
    }
}








