package day06_월;

import java.util.Arrays;

public class Example1_배열 {

    public static void main(String[] args) {

        /*
         * =======================================================================
         * [ 파트 0. 왜 배열이 필요할까요? - "데이터를 한 바구니에!" ]
         * =======================================================================
         *
         * [1] 배열(Array) 정의
         * - 동일한 자료형(타입)의 데이터 여러 개를 *순서대로* 묶어서 관리하는 자료구조입니다.
         * - 변수 하나로 여러 데이터를 관리할 수 있어 효율적입니다.
         *
         * [2] 배열의 주요 특징 및 주의점
         * 1. 동일한 타입: 배열에 저장되는 모든 자료는 서로 같은 타입이어야 합니다. (예: int 배열에는 정수만!)
         * 2. 고정 길이: 배열은 한 번 생성되면 길이를 수정할 수 없습니다.
         *
         * [비유 1: 계란판]
         * "계란 30개를 담으려면, 30칸짜리 계란판(배열) 하나면 충분합니다."
         * 각 칸에는 0번부터 29번까지 번호(인덱스)가 매겨져 있어 원하는 계란을 쉽게 찾을 수 있습니다.
         */

        System.out.println("--- [자바 배열 문법 마스터 클래스를 시작합니다!] ---");

        // --- 1. 자바의 기본 배열 선언과 생성 ---
        // [3] 배열 선언 및 생성 방법
        //   - 방법1: new 연산자로 길이만 지정.
        //     타입[] 변수명 = new 타입[길이];
        //   - 방법2: 중괄호{}를 이용해 선언과 동시에 값을 초기화.
        //     타입[] 변수명 = { 값1, 값2, 값3, ... };
        //   - 방법3: 선언과 초기화를 분리. (new 타입[] 생략 불가)
        //     타입[] 변수명;
        //     변수명 = new 타입[]{ 값1, 값2, ... };
        System.out.println("\n--- 1. 기본 배열 선언과 사용법 ---");

        // 방법2 예시 (String 배열)
        String[] season = { "봄", "여름", "가을", "겨울" };

        // 방법1 예시 (int 배열)
        int[] array1 = new int[3]; // 3칸짜리 int 배열 생성.

        // [4] 배열 요소의 기본값
        //   - new 키워드로 배열 생성 시, 초기값이 없으면 타입별 기본값이 자동으로 들어갑니다.
        //   - 정수: 0, 실수: 0.0, 논리: false, 클래스/참조타입: null
        System.out.println("생성 직후 array1의 내용: " + Arrays.toString(array1)); // [0, 0, 0] 출력

        // [5] 인덱스(Index)란?
        //   - 배열에 저장된 각 자료의 위치를 나타내는 0부터 시작하는 번호입니다.
        //   - 범위: 0부터 (배열 길이 - 1)까지.
        //   - 인덱스를 통해 배열 내의 특정 요소를 식별하고 접근할 수 있습니다.

        // [6] 배열 요소(값)에 접근하기
        //   - 요소 값 수정/대입 : 배열변수명[인덱스] = 새로운값;
        System.out.println("\n[배열 요소 수정 및 대입]");
        array1[0] = 10; // 0번 인덱스에 10을 대입
        array1[1] = 20; // 1번 인덱스에 20을 대입
        array1[2] = 30; // 2번 인덱스에 30을 대입
        System.out.println("수정 후 array1[1]의 값: " + array1[1]);

        //   - 요소 값 호출 : 배열변수명[인덱스]
        System.out.println("\n[배열 요소 호출]");
        System.out.println("season 배열의 0번 인덱스: " + season[0]);
        System.out.println("array1 배열의 2번 인덱스: " + array1[2]);

        // [7] 배열 변수를 직접 출력할 때
        //   - 배열변수명: 내용물이 아닌, 메모리상의 주소값(또는 해시코드)이 출력됩니다.
        //   - Arrays.toString(배열변수명): 배열의 모든 요소를 "[값1, 값2, ...]" 형태의 문자열로 반환합니다.
        System.out.println("\n[배열 변수 직접 출력]");
        System.out.println("array1 변수를 직접 출력: " + array1);
        System.out.println("Arrays.toString() 사용: " + Arrays.toString(array1));

        // [8] 배열의 길이 속성 : 배열변수명.length
        System.out.println("\n[배열 길이 확인]");
        System.out.println("season 배열의 길이: " + season.length);
        System.out.println("array1 배열의 길이: " + array1.length);

        // [9] 배열과 반복문의 관계
        //   - 배열은 인덱스가 0부터 1씩 증가하는 규칙이 있어 반복문으로 다루기 매우 편리합니다.
        //   - 배열의 전체 요소를 순회(하나씩 조회)할 때 주로 사용됩니다.
        System.out.println("\n[반복문으로 전체 출력]");
        for (int i = 0; i < season.length; i++) { // i는 0부터 (배열길이-1)까지 반복
            System.out.println(i + "번 인덱스의 값: " + season[i]);
        }


        // --- 2. 기본 배열의 주요 활용법 ---
        System.out.println("\n--- 2. 기본 배열의 주요 활용법 ---");

        // 2-1. 배열에서 값 찾기 (탐색)
        String target = "가을";
        int foundIndex = -1; // 찾지 못했을 경우를 대비해 -1로 초기화
        for (int i = 0; i < season.length; i++) {
            if (season[i].equals(target)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("'" + target + "'은(는) " + foundIndex + "번 인덱스에서 찾았습니다.");
        } else {
            System.out.println("'" + target + "'을(를) 찾지 못했습니다.");
        }

        // 2-2. 배열 복사하기
        String[] seasonCopy = new String[season.length];
        for (int i = 0; i < season.length; i++) {
            seasonCopy[i] = season[i];
        }
        System.out.println("복사된 배열: " + Arrays.toString(seasonCopy));


        // --- 3. 기본 배열의 한계 (추가와 삭제의 어려움) ---
        System.out.println("\n--- 3. 기본 배열의 한계 ---");
        // 기본 배열은 크기가 고정되어 있어, 요소를 추가하거나 삭제하는 것이 매우 번거롭습니다.
        // [10] 요소 값 삭제 : 없음 # 배열의 특정 요소만 따로 삭제할 수 없다. (고정 길이 때문)
        // 결국 '더 크거나 작은 새 배열을 만들고, 내용을 옮겨 담는' 작업이 필요합니다.

        // 3-1. 요소 추가(처럼 보이게 하기)
        String[] newSeason = new String[season.length + 1];
        for (int i = 0; i < season.length; i++) {
            newSeason[i] = season[i];
        }
        newSeason[4] = "초봄";
        System.out.println("요소 추가 후: " + Arrays.toString(newSeason));

        // 3-2. 요소 삭제(처럼 보이게 하기)
        String[] removedSeason = new String[season.length - 1];
        int newIndex = 0;
        for (int i = 0; i < season.length; i++) {
            if (i == 1) { // 1번 인덱스("여름")는 건너뛴다.
                continue;
            }
            removedSeason[newIndex] = season[i];
            newIndex++;
        }
        System.out.println("요소 삭제 후: " + Arrays.toString(removedSeason));

        // ★★★ 결론: 이처럼 추가/삭제가 번거롭기 때문에, 데이터의 개수가 자주 바뀌는 상황에서는
        // '크기가 자동으로 조절되는 마법 주머니' 같은 ArrayList를 사용하는 것이 훨씬 효율적입니다. ★★★
    }
}