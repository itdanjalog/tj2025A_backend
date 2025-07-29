package day22_화;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        // 1. Random 객체 생성
        Random random = new Random();
        System.out.println("Random 클래스 종합 예제 (ArrayList 사용)\n");

        // --- 정수 난수 생성 ---
        System.out.println("## 정수 난수 생성 ##");

        // 2. 특정 범위의 정수 난수 (예: 1 ~ 6 사이의 주사위 눈)
        int diceRoll = random.nextInt(6) + 1;
        System.out.println("🎲 주사위 던지기 (1-6): " + diceRoll);

        // 3. 0부터 n-1까지의 정수 난수 (예: 0 ~ 99)
        int randomNumber = random.nextInt(100);
        System.out.println("📊 0부터 99까지의 난수: " + randomNumber);

        System.out.println("---");

        // --- 다른 타입의 난수 생성 ---
        System.out.println("## 다양한 타입의 난수 생성 ##");

        // 4. 0.0과 1.0 사이의 double 타입 난수
        double randomDouble = random.nextDouble();
        System.out.println("💧 0.0과 1.0 사이의 실수: " + randomDouble);

        // 5. true 또는 false 무작위 생성
        boolean randomBoolean = random.nextBoolean();
        System.out.println("✔️ 또는 ❌? " + (randomBoolean ? "✔️ (true)" : "❌ (false)"));

        System.out.println("---");

        // --- 응용 예제 (ArrayList 사용) ---
        System.out.println("## 응용 예제 (ArrayList) ##");

        // 6. ArrayList에서 무작위로 요소 하나 선택하기
        ArrayList<String> lunchMenu = new ArrayList<>(
                Arrays.asList("김치찌개", "돈까스", "제육볶음", "파스타", "샐러드")
        );

        // 리스트의 크기(size) 내에서 무작위 인덱스 생성
        int randomIndex = random.nextInt(lunchMenu.size());
        // .get() 메소드를 사용하여 해당 인덱스의 요소 가져오기
        String selectedMenu = lunchMenu.get(randomIndex);

        System.out.println("🍽️ 오늘의 점심 추천 메뉴: " + selectedMenu);
        System.out.println("선택 가능한 메뉴: " + lunchMenu);


        // [활용] : 문자열 인증코드 만들기
        String code = "";
        for( int i = 1 ; i<=6 ; i++ ) {
            System.out.println( new Random() ); // 랜덤(난수) 관련 클래스
            System.out.println( new Random().nextInt() ); 		// int타입의 난수 반환함수
            System.out.println( new Random().nextInt(26) );		// 0 ~ 25 사이의 난수 반환 함수.
            System.out.println( new Random().nextInt(26) + 97 ); // 97 ~ 122 사이의 난수 반환 함수.
            System.out.println( (char)(new Random().nextInt(26) + 97) );
            code += (char)( new Random().nextInt(26) + 97 );
        } // f end
        System.out.println( code ); // 임의의 난수 문자열 생성



    }
}
