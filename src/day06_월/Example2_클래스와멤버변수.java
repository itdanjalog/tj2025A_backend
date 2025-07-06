/*



[객체]
	- 의사나 행위가 미치는 대상
		- 사람 , 자동차 , 건물 등
		- 주문 , 생산 , 관리 등
			---> 강사(김현수) 기준에서는 학생(유재석) 객체
			---> 학생(유재석) 기준에서는 강사(김현수) 객체
	- 객(손님)체

[객체지향 프로그래밍]
	- 어떤 대상(객체)을 가지고 프로그맹한다.

[클래스]
	- 객체의 속성과 기능을 코드로 구현한 것
		- 속성 : 대상의 본질적인 특징/성질/특성		* 멤버변수
		- 기능 : 대상의 작동/행위/이벤트 			* 메소드( 멤버함수 )
	- 클래스 형태
		class 클래스명{  멤버변수; 메소드; }
	- 클래스 이름 짓는 규칙 : 대문자로 시작한다.
	- * 객체 만들기 위한 객체의 일종의 틀(설계도)
	- 클래스 사용처 : 1. 객체 설계도 클래스 2. main함수 갖는 실행 클래스

[예시]
	예시1 ] 학생 ,
		- 속성(멤버변수) : 학번,이름,학년,사는곳 등등
		- 클래스 코드 표현
		public class Student{
			int studentID;
			String studentName;
			int grade;
			String address;
		}

	예시2 ] 자동차
		- 속성(멤버변수) : 제조사, 차량번호, 색상, 현재속도, 엔진상태
		- 클래스 코드 표현
		public class Car{
			String 제조사;
			String 차량번호;
			int 현재속도;
		}

	예시3 ] 주문
		- 속성(멤버변수) : 주문번호, 제품명, 수량, 주문날짜
		- 클래스 코드 표현
		public class Order{
			String 주문번호;
			String 제품명;
			int 수량;
		}


*/

package day06_월;

public class Example2_클래스와멤버변수 {

    public static void main(String[] args) {
        // [1] 클래스 정의하기 , 객체를 만들기위한 일종의 틀 / 설계도 만들기
        // ==> 생활속에서 틀/설계도 필요한이유?
        // ==> 붕어빵 가게에서 붕어빵 구매.. 주인이 붕어빵을 손으로 만들기. / 모양이 일정하지 않음 , 오래 걸린다.
        // ==> 붕어빵틀 사용하면 빠르고 일정한 모양으로 붕어뻥을 만들수 있다.
        // * 객체 설계도 클래스는 main함수가 없어도 된다.
        // * 클래스 생성하는 방법 : class 클래스명{   }

        // [2] 객체 생성하기 , 클래스 기반으로 메모리 할당하기. , 인스턴스
        // ==> 붕어빵 2개 주세요. ==> 객체 2개 생성
        // * 객체 생성하는 방법 : new 클래스명();  , 클래스명 변수명 = new 클래스명();
        new 붕어빵틀(); // 붕어빵1 생성
        new 붕어빵틀(); // 붕어빵2 생성
        붕어빵틀 붕어빵1 = new 붕어빵틀(); // 붕어빵3 생성하고 변수에 담았다.
        붕어빵틀 붕어빵2 = new 붕어빵틀();	// 붕어빵4 생성하고 변수에 담았다.
        // [3] 객체의 멤버변수 접근하기  , .(접근연산자)를 이용한 멤버변수를 사용한다.
        붕어빵1.내용물 = "슈크림";
        붕어빵2.내용물 = "팥";

        // [1] 클래스 정의하기
        // - 만들고자 하는 객체가 가질수 있는 속성들을 구성하여 클래스에 코드로 작성한다.
        // [2] 객체 생성하기 , 클래스 기반
        // - new 클래스명(); , 클래스명 변수명 = new 클래스명();
        new Car(); // 객체 생성후 변수에 대입하지 않으면 사라진다.
        // 주로 객체 생성과 동시에 변수에 담는다. *변수타입은 객체의 클래스(타입)으로 한다.
        Car car1 = new Car();
        Car car2 = new Car();
        // [3] 객체의 멤버변수 접근하기 , 동일한 설계도/클래스 로 서로 다른 객체 2개 생성
        car1.차량주 = "유재석";
        car2.차량주 = "강호동";

        // - 생각해보기 :
        // 클래스(붕어빵/자동차 제외) 를 하나 정의 하고 객체 2개 이상 선언 하여 멤버변수에 값을 대입하는 코드를 작성하시오.
    }

}



/*

// [1] 클래스 정의하기 (설계도 만들기)
// - 클래스는 객체를 만들기 위한 '설계도' 또는 '틀'입니다.
// - 만들고자 하는 객체가 가질 속성(데이터)들을 '멤버 변수'로 정의합니다.
// - 이 클래스 자체는 실체가 아니며, main 함수가 없어도 됩니다.
class BungeoppangMold { // 붕어빵을 만들기 위한 '틀' 클래스
    String filling; // 붕어빵의 '내용물'이라는 속성(데이터)
    int price;      // 붕어빵의 '가격'이라는 속성(데이터)
}

class Character { // 게임 캐릭터를 만들기 위한 '설계도' 클래스
    String nickname; // 캐릭터의 '닉네임' 속성
    String job;      // 캐릭터의 '직업' 속성
    int level;       // 캐릭터의 '레벨' 속성
}

public class ClassObjectLesson {

    public static void main(String[] args) {


         * =======================================================================
         * [ 파트 0. 왜 클래스(Class)가 필요할까요? - "세상의 모든 것은 객체다!" ]
         * =======================================================================
         *
         * 우리가 만드는 프로그램은 현실 세계를 흉내 내는 경우가 많습니다.
         * 클래스는 현실의 '사물'이나 '개념'을 코드로 표현하는 설계도 역할을 합니다.
         *
         * [비유 1: 붕어빵 가게]
         * - 클래스(Class)  : 붕어빵을 찍어내는 '붕어빵 틀' (설계도)
         * - 객체(Object)   : 붕어빵 틀로 찍어낸 각각의 '붕어빵' (실체, 결과물)
         *
         * 붕어빵 가게 사장님이 손으로 붕어빵을 만들면 모양도 제각각이고 시간도 오래 걸립니다.
         * 하지만 '붕어빵 틀'이 있으면, 빠르고 일정한 모양의 붕어빵을 계속 만들어낼 수 있습니다.
         * 클래스가 바로 이 '틀'의 역할을 합니다.


        System.out.println("--- [클래스와 객체 문법 마스터 클래스를 시작합니다!] ---");

        // --- 1. 객체(Object) 생성하기 ---
        // [2] 객체 생성(인스턴스화)
        //   - 클래스(설계도)를 바탕으로 메모리에 실체를 만드는 과정입니다.
        //   - 'new' 키워드를 사용하여 객체를 생성합니다.
        //   - 문법: 클래스명 변수명 = new 클래스명();
        System.out.println("\n--- 1. 객체 생성하기 ---");

        BungeoppangMold bungeoppang1 = new BungeoppangMold(); // 붕어빵 틀로 첫 번째 붕어빵을 만듦
        BungeoppangMold bungeoppang2 = new BungeoppangMold(); // 붕어빵 틀로 두 번째 붕어빵을 만듦

        System.out.println("bungeoppang1 객체 생성 완료: " + bungeoppang1);
        System.out.println("bungeoppang2 객체 생성 완료: " + bungeoppang2);
        System.out.println("-> 두 붕어빵은 같은 틀에서 나왔지만, 서로 다른 주소값을 가진 별개의 존재입니다.");


        // --- 2. 객체의 멤버 사용하기 (속성 부여) ---
        // [3] 객체 멤버 접근
        //   - 생성된 객체의 멤버 변수(속성)에 값을 저장하거나 불러올 때 사용합니다.
        //   - 객체 참조 변수 뒤에 .(점) 접근 연산자를 붙여 사용합니다.
        //   - 문법: 변수명.멤버변수명 = 값;  (값 저장)
        //   - 문법: 타입 변수 = 변수명.멤버변수명; (값 호출)
        System.out.println("\n--- 2. 객체의 멤버 사용하기 ---");

        // 각 붕어빵 객체에 고유한 내용물과 가격을 정해줍니다.
        bungeoppang1.filling = "팥";
        bungeoppang1.price = 1000;

        bungeoppang2.filling = "슈크림";
        bungeoppang2.price = 1200;

        System.out.println("첫 번째 붕어빵의 내용물: " + bungeoppang1.filling);
        System.out.println("첫 번째 붕어빵의 가격: " + bungeoppang1.price + "원");
        System.out.println("------------------------------------");
        System.out.println("두 번째 붕어빵의 내용물: " + bungeoppang2.filling);
        System.out.println("두 번째 붕어빵의 가격: " + bungeoppang2.price + "원");


        // --- 3. 클래스 활용 예시 : 게임 캐릭터 만들기 ---
        System.out.println("\n--- 3. 클래스 활용 예시 : 게임 캐릭터 ---");

        // Character 클래스(설계도)로 2명의 캐릭터 객체를 생성
        Character warrior = new Character();
        Character mage = new Character();

        // 각 캐릭터 객체에 고유한 속성(데이터)을 부여
        warrior.nickname = "전사_유재석";
        warrior.job = "전사";
        warrior.level = 50;

        mage.nickname = "마법사_강호동";
        mage.job = "마법사";
        mage.level = 52;

        // 각 캐릭터의 정보 출력
        System.out.println("[전사 캐릭터 정보]");
        System.out.println("닉네임: " + warrior.nickname);
        System.out.println("직업: " + warrior.job);
        System.out.println("레벨: " + warrior.level);

        System.out.println("\n[마법사 캐릭터 정보]");
        System.out.println("닉네임: " + mage.nickname);
        System.out.println("직업: " + mage.job);
        System.out.println("레벨: " + mage.level);

        // ★★★ 결론: 클래스라는 '설계도' 하나만 잘 만들어두면,
        // 속성만 다른 수많은 '객체'들을 쉽고 체계적으로 관리할 수 있습니다. ★★★

    }
}
*/