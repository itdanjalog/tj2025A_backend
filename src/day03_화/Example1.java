package day03_화;

public class Example1 {

    public static void main(String[] args) {

        /*
         * =======================================================================
         * [ 파트 0. 왜 조건문(if)이 필요할까요? - "인생은 선택의 연속" ]
         * =======================================================================
         *
         * 컴퓨터는 스스로 생각하지 못하는 '성실하지만 눈치 없는 비서'와 같습니다.
         * 모든 상황에 대한 행동 지침을 개발자가 명확하게 알려주어야 합니다.
         * 이때 사용하는 것이 바로 '조건문'입니다.
         *
         * [비유 1: 갈림길]
         * "만약(if) 비가 오면, 우산을 챙겨라."
         * -> if ( 날씨 == "비" ) { 행동 = "우산 챙기기"; }
         *
         * [비유 2: 식당 메뉴판]
         * "만약(if) 돈까스를 원하면 8000원을 내고,
         * 그게 아니고 만약(else if) 김밥을 원하면 3000원을 내고,
         * 그것도 아니면(else) 물만 마셔라."
         * -> 여러 선택지 중 '하나만' 고르는 상황입니다.
         *
         * [비유 3: 퇴근 전 체크리스트]
         * "만약(if) 창문이 열려있으면, 창문을 닫아라."
         * "만약(if) 컴퓨터가 켜져있으면, 컴퓨터를 꺼라."
         * "만약(if) 쓰레기통이 찼으면, 쓰레기통을 비워라."
         * -> 각각의 조건을 '독립적으로' 모두 확인해야 하는 상황입니다.
         */

        System.out.println("--- [if 조건문 마스터 클래스를 시작합니다!] ---");


        // --- 1. 가장 기본적인 선택 : if ---
        // 상황 : "만약 날씨가 추우면, 외투를 입으세요." 처럼 단 하나의 조건과 행동만 있을 때
        System.out.println("\n--- 1. 가장 기본적인 if문 ---");
        int temperature = 5; // 현재 온도가 5도라고 가정
        if (temperature <= 10) { // 만약 온도가 10도 이하면 (true)
            System.out.println("결과: 날씨가 춥네요. 외투를 챙기세요.");
        }


        // --- 2. 초보자의 가장 흔한 함정 : 중괄호 {}의 중요성 ---
        // 상황 : "만약 미성년자이면, '미성년자입니다' 와 '보호자가 필요해요' 두 문장을 모두 보여주자!"
        System.out.println("\n--- 2. 중괄호 {}의 중요성 (오류 체험 및 해결) ---");
        int age = 10;

        System.out.println("[오류 상황] 중괄호를 쓰지 않았을 때:");
        if (age >= 19) // 이 조건은 false 입니다.
            System.out.println("성인입니다."); // 이 줄만 if의 영향을 받습니다.
        System.out.println(">> 이 문장은 조건과 상관없이 항상 출력됩니다! (의도치 않은 동작)");

        System.out.println("\n[해결] 중괄호로 코드 블록을 묶었을 때:");
        // 중괄호는 '여기부터 여기까지가 한 묶음이다!' 라고 알려주는 안전한 주머니와 같습니다.
        if (age >= 19) { // 이 조건이 false 이므로,
            System.out.println("성인입니다."); // 주머니 안의 모든 코드는
            System.out.println(">> 이 문장은 이제 출력되지 않습니다. (의도한 동작)"); // 실행되지 않습니다.
        }
        // ★★★ 베테랑의 조언: 실행할 코드가 한 줄이더라도, 항상 중괄호{}를 쓰는 습관을 들이세요! ★★★


        // --- 3. 둘 중 하나, 양자택일 : if-else ---
        // 상황 : "만약 회원이라면 '환영합니다', 아니라면 '가입이 필요합니다' 라고 안내하자."
        System.out.println("\n--- 3. 양자택일 if-else ---");
        boolean isMember = false; // 현재 비회원이라고 가정
        if (isMember == true) { // 만약 회원이라면 (false)
            System.out.println("결과: 회원님, 환영합니다!");
        } else { // 그게 아니라면
            System.out.println("결과: 비회원입니다. 가입 후 이용해주세요.");
        }


        // --- 4. 여러 갈래의 길, 다중 선택 : if - else if - else ---
        // 상황 : 놀이공원 요금 계산기. 나이에 따라 요금이 달라진다. 선택지는 여러개지만, 요금은 하나만 결정된다.
        System.out.println("\n--- 4. 다중 선택 if-else if-else ---");
        int visitorAge = 15;
        int charge; // 요금을 저장할 변수

        if (visitorAge < 8) { // 8살 미만인가? (false)
            charge = 1000;
            System.out.println("분류: 취학 전 아동입니다.");
        } else if (visitorAge < 14) { // 그럼 14살 미만인가? (false)
            charge = 2000;
            System.out.println("분류: 초등학생입니다.");
        } else if (visitorAge < 20) { // 그럼 20살 미만인가? (true) -> 여기서 실행되고 즉시 if문 전체를 빠져나감.
            charge = 2500;
            System.out.println("분류: 중, 고등학생입니다.");
        } else { // 위의 모든 조건에 해당하지 않는다면
            charge = 3000;
            System.out.println("분류: 일반인입니다.");
        }
        System.out.println("결과: 입장료는 " + charge + "원 입니다.");


        // --- 5. 심화 학습 : 'if-else if' 와 'if-if-if' 의 결정적 차이 ---
        // 'if-else if'는 "여러 선택지 중 단 하나만!", 'if-if'는 "각각의 조건을 모두 독립적으로 검사!"
        System.out.println("\n--- 5. 'if-else if' vs 'if-if-if' 비교 ---");
        int myScore = 95;

        System.out.println("[올바른 상황] if-else if 사용 (하나의 등급만 나옴)");
        if (myScore >= 90) { System.out.println("A등급"); }
        else if (myScore >= 80) { System.out.println("B등급"); }
        else { System.out.println("C등급"); }

        System.out.println("\n[잘못된 상황] if-if 사용 (여러 등급이 나올 수 있음)");
        if (myScore >= 90) { System.out.println("A등급"); } // 95 >= 90 (true) -> 출력
        if (myScore >= 80) { System.out.println("B등급"); } // 95 >= 80 (true) -> 또 출력!
        if (myScore < 80) { System.out.println("C등급"); }  // 95 < 80 (false) -> 출력 안됨


        // --- 6. 선택 속의 선택 : 중첩 if 문 ---
        // 상황 : "만약 성인이라면, 그 중에서 여성인지 남성인지 구분해서 다른 메시지를 보여주자."
        System.out.println("\n--- 6. 중첩 if문 ---");
        int userAge = 25;
        char userGender = 'W';

        if (userAge >= 19) { // 1차 관문: 성인인가? (true)
            System.out.println("1차 판별: 성인입니다. 2차 판별을 시작합니다.");

            if (userGender == 'W') { // 2차 관문: 여성인가? (true)
                System.out.println("최종 결과: 성인 여성이시군요. 환영합니다!");
            } else {
                System.out.println("최종 결과: 성인 남성이시군요. 환영합니다!");
            }

        } else { // 1차 관문 통과 실패
            System.out.println("최종 결과: 미성년자는 입장이 제한됩니다.");
        }
    }
}
