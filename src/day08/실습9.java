package day08;

public class 실습9 {
    public static void main(String[] args) {
        // [1]
        Book book1 = new Book("이것이 자바다" , "신용권", 30000 );
        Book book2 = new Book("자바의 정석", "남궁성", 28000);
        // Book book3 = new Book(); // 오류발생 : 존재하지 않는 생성자
        System.out.printf("%s \t %s \t %d \n" ,
                book1.title , book1.author , book1.price );
        System.out.printf("%s \t %s \t %d \n" ,
                book2.title , book2.author , book2.price );

        // [2]
        Pet pet1 = new Pet("초코", "푸들", 3);
        Pet pet2 = new Pet("나비", "코리안숏헤어", 5);
        // 오류발생 : 인수 타입 과 매개변수 타입이 일치한 생성자가 없어서
        // Pet pet3 = new Pet( 3 , "푸들" , "초코" );
        System.out.printf("%s \t %s \t %d \n" ,
                pet1.name , pet1.species , pet1.age );
        System.out.printf("%s \t %s \t %d \n" ,
                pet2.name , pet2.species , pet2.age );

        // [3]
        Rectangle rect1 = new Rectangle( 10 , 5 );
        int result3 = rect1.getArea();
        System.out.printf("넓이 : %d \n" , result3 );

        // [4] 하고 한 후의 최종 잔액을 출력하세요.
        BankAccount account1 = new BankAccount("111-222-3333", "유재석", 10000);
        account1.deposit( 5000 ); // 5000원을 입금 , 15000
        account1.withdraw( 3000 ); // 3000원을 출금 , 12000
        System.out.println("최종잔액 : "+ account1.balance ); // 최종 잔액

        // [5] Goods 클래스를 만드세요.
        // *) 변수란? 하나의 자료를 저장(재사용) 할수 있는 메모리공간
        // *) 자바 변수 규칙 : 타입 변수명 = 자료
        // *) 타입 : 자료의 종류 , 기본자료형(8가지) vs 참조자료형(그외:클래스/배열)
        // 1) 기본생성자 객체(인스턴스) 생성
        Goods goods1 = new Goods();
        // 2) 매개변수가 있는 생성자 생성
        Goods goods2 = new Goods("콜라",2000);
        // 3) 저장된 변수내 객체내 멤버변수 값 호출
        System.out.println( goods1.name + " \t " + goods1.price );
        System.out.println( goods2.name + " \t " + goods2.price );

        // [6] Member 클래스를 만드세요.
        // 1) 한방에 객체를 생성하고 출력하시오.
        Member m1 = new Member();
        System.out.println( m1.id + " \t " + m1.isLogin );
        // + 관례적/주로
            // -> 서로다른 타입 혹은 서로 다른 의미를 갖는 자료 또는 존재하지 않은 타입은 클래스 정의
                // 예] Goods , Member 등 자바 회사에서 제공하지 않은 타입/클래스
                // String , Scanner 등 자바 회사에서 제공하는 클래스
            // -> 같은 타입 혹은 같은 의미 갖는 자료는 배열 정의
                // 예1] 가격(int) 여러개 : int[] 가격목록 = new int[100];
                // 예2] 회원(Member) 여러개 : Member[] 회원목록 = new Member[100];
                // 가격(int) 재고(int) : class 제품정보{ int 가격; int 재고; }

    } // main end
} // class end
/*
[JAVA] 실습9 : 클래스와 객체의생성자
[ 문제 ] 아래 클래스와 생성자 관련 핵심 문제를 해결하시오.
[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.

[문제 1] Book 클래스를 만드세요. (title, author, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Book 클래스에 title, author, price를 매개변수로 받아 멤버 변수를 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여, ("이것이 자바다", "신용권", 30000) 정보와 ("자바의 정석", "남궁성", 28000) 정보를 가진 Book 객체 2개를 생성하고, 각 객체의 정보를 출력하세요.

[문제 2] Pet 클래스를 만드세요. (name, species, age 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Pet 클래스에 name, species, age를 매개변수로 받아 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여, ("초코", "푸들", 3) 정보와 ("나비", "코리안숏헤어", 5) 정보를 가진 Pet 객체 2개를 생성하고, 각 객체의 프로필을 출력하세요.

[문제 3] Rectangle 클래스를 만드세요. (width, height 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. width와 height를 매개변수로 받아 초기화하는 생성자를 만드세요.
2. 사각형의 넓이(width * height)를 계산하여 반환하는 getArea() 메소드를 만드세요.
3. main 함수에서 (10, 5) 값을 가진 Rectangle 객체를 생성하고, getArea() 메소드를 호출하여 "사각형의 넓이: [넓이]"를 출력하세요.

[문제 4] BankAccount 클래스를 만드세요. (accountNumber, ownerName, balance 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. 입금(deposit)과 출금(withdraw) 기능을 하는 메소드를 각각 만드세요.
3. main 함수에서 ("111-222-3333", "유재석", 10000) 정보로 객체를 생성한 뒤, 5000원을 입금하고 3000원을 출금한 후의 최종 잔액을 출력하세요.

[문제 5] Goods 클래스를 만드세요. (name, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Goods 클래스에 생성자를 두 개 만드세요(오버로딩).
2. 기본 생성자: name은 "미정", price는 0으로 초기화
3. 매개변수가 있는 생성자: name과 price를 매개변수로 받아 초기화
4. main 함수에서 기본 생성자로 객체 하나, 매개변수가 있는 생성자로 ("콜라", 2000) 정보를 가진 객체 하나를 각각 생성하고, 두 객체의 정보를 모두 출력하세요.

[문제 6] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Member 클래스에 기본 생성자를 만들고, 이 생성자 안에서 id는 "guest", isLogin은 false로 초기화되도록 하세요.
2. main 함수에서 new Member()로 객체를 생성하고, 초기화된 id와 isLogin 값을 출력하여 확인하세요.

[문제 7] Television 클래스를 만드세요. (channel, volume 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. channel과 volume을 매개변수로 받아 초기화하는 생성자를 만드세요.
2. main 함수에서 (채널 7, 볼륨 20) 상태를 가진 Television 객체를 생성하고, 해당 객체의 정보를 출력하세요.

[문제 8] Player 클래스를 만드세요. (name, power, speed 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여, ("손흥민", 90, 95) 정보를 가진 객체와 ("이강인", 85, 92) 정보를 가진 객체를 생성하세요.
3. 두 객체의 정보를 각각 출력하여 확인하세요.

[문제 9] MenuItem 클래스를 만드세요. (name, price, isSignature 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여 "김치찌개", 8000, true 정보를 가진 객체를 생성하고, isSignature가 true인지 확인한 후 "[대표메뉴] 김치찌개 : 8000원" 형식으로 출력하세요.

[문제 10] UserProfile 클래스를 만드세요. (name, age, mbti 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 입력받으세요.
3. 입력받은 값들을 사용하여 UserProfile 객체를 생성하고, 저장된 모든 정보를 출력하세요.


*/