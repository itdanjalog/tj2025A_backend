package day16;

public class Example1 {
    public static void main(String[] args) {
        /*
            [ 예외 처리 ]
                1. 시스템 오류 : 시스템이 종료되는 심각한 수준의 문제
                2. 예외 : 개발자가 구현한 로직이나 사용자의 영향으로 의한 문제
                3. 예외 종류
                    1) 일반 예외 : 컴파일(실행)될떄 예외 처리 코드 여부 검사 예외
                        - 입출력 , 네트워크 , 파일 , JBDC(자바-DB연동) , 주로 자바외부 통신 : Class.forName() , Thread.sleep()

                    2) 실행 예외 : 컴파일(실행)될때 예외 처리 코드 여부 검사 하지 않는 예외 , 개발자의 (경험) 의존도가 크다.


                4. 예외란
                    - 예외/오류 발생시 예외를 고치는게 아니라 **흐름 제어** vs if 비슷
                    - 프로그램을 24시간 중단 없이 실행하기 위한 안전한 로직 구현 <100%없다. --> 유지보수>
                    
                5. 예외 클래스
                    ClassNotFoundException  : 클래스를 못찾았을때 발생되는 정보를 저장하는 클래스
                    InterruptedException    : 흐름를 중단 되었을때 발생되는 정보를 저장하는 클래스 

                6. 사용법
                    try{ 예외가 발생할 것 같은 코드 또는 일반예외 }
                    catch( 예외클래스명 매개변수명 ){ 지정한예외발생시 처리할 코드 }

        */
        // ------------------------ 예제 에서는 강제로 예외 발생하는 상황 ------------------------
        // [1] 일반 예외 : 예외가 있던/없던 무조건 예외처리 해야한다.
        try { // 1.일반예외 발생 코드를 try{} 감싼다.
            Class.forName("java.lang.String");  // Class.forName( 클래스경로 ); // 해당 경로의 클래스를 읽어오는 함수
        }catch ( ClassNotFoundException e ){ // 2. catch( 예외클래스명 매개변수명 ){ } 에서 예외발생시 처리할 코드
            System.out.println("[예외발생1] String 클래스가 없습니다. ");
        }

        // [2] 일반 예외 , 예외발생
        try{
            Class.forName("java.lang.String2"); // String2 클래스는 존재하지 않아서 예외 발생한다.
        }catch ( ClassNotFoundException e ){
            System.out.println("[예외발생2] String2 클래스가 없습니다. " + e );
            // [예외발생] String2 클래스가 없습니다. java.lang.ClassNotFoundException: java.lang.String2
        }

        // [3] 일반 예외
        try {
            Thread.sleep(1000); // 코드 실행을 1초간 일시정시 함수.
        }catch ( InterruptedException e ){
            System.out.println("[예외발생3] sleep 도중에 오류 발생" );
        }

        // [4] 실행 예외 : 프로그램 실행 도중에 발생하는 예외 , <예측>
        // .NullPointerException : 객체가 없는데 객체에 접근연산자 사용 하면 발생하는 예외
        try {
            String str1 = "강호동";
            System.out.println(str1.length()); // "문자열".length() : 문자열 길이 반환 함수
            String str2 = null; // 자바에서 null 이란? 변수가 참조(저장)하는 값/객체 가 없다 뜻
            System.out.println(str2.length());    // .(접근연산자)란 객체내 메소드 호출
        }catch ( NullPointerException e ){
            System.out.println( "[예외발생4] 객체가 없어서 .length() 사용불가능 ");
        }


    } // main end
} // class end








