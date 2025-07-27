package day21_월;

class 작업스레드A extends Thread {

    final String name;

    작업스레드A( String name ) {
        this.name = name;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(500); // 약간의 딜레이 후 시작

            // 스레드 이름 설정
            this.setName("작업스레드"+ name );

            for (int i = 1; i <= 5; i++) {
                System.out.println("[" + this.getName() + "] 작업 중... (" + i + ")");
                Thread.sleep(1000); // 1초 대기
            }

            System.out.println("[" + this.getName() + "] 작업 완료!");

        } catch (InterruptedException e) {  }
    }
}

public class Example2 {
    public static void main(String[] args) {
        // main 스레드 이름 변경
        Thread.currentThread().setName("메인스레드");

        System.out.println("[" + Thread.currentThread().getName() + "] 프로그램 시작");

        // 작업 스레드 생성 및 실행
        작업스레드A thread1 = new 작업스레드A("유재석");
        thread1.start();

        // 작업 스레드 생성 및 실행
        작업스레드A thread2 = new 작업스레드A("강호동");
        thread2.start();

        try {
            System.out.println("[" + Thread.currentThread().getName() + "] 작업스레드A가 끝날 때까지 대기 중...");

            // main 스레드는 thread1이 끝날 때까지 대기
            thread1.join();

            System.out.println("[" + Thread.currentThread().getName() + "] 작업스레드A 종료 확인 후 계속 진행");

        } catch (InterruptedException e) {  }

    }
}
