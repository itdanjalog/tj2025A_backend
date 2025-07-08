package day08_수;

public class 실습10_접근제한자 {
}


/*
[JAVA] 실습10 : 접근 제한자와 캡슐화
[ 문제 ] 아래 접근 제한자와 캡슐화 관련 문제를 해결하시오.
[ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.

[문제 1] private 필드와 Getter/Setter
Member 클래스를 만드세요. 이 클래스는 private 접근 제한자를 가진 id(문자열) 멤버 변수를 가집니다.
private으로 선언된 id 필드의 값을 저장하고, 반환할 수 있도록 public 접근 제한자를 가진 setId()와 getId() 메소드(Getter/Setter)를 만드세요.
main 함수에서 Member 객체를 생성하고, setId()로 아이디를 "admin"으로 설정한 뒤, getId()로 설정된 아이디를 가져와 출력하세요.

[문제 2] Setter를 이용한 데이터 유효성 검사
Score 클래스를 만드세요. private 접근 제한자를 가진 score(정수) 멤버 변수를 가집니다.
점수를 설정하는 setScore(int score) 메소드를 정의하세요.
이 메소드는 매개변수로 받은 점수가 0 이상 100 이하일 경우에만 멤버 변수 score에 값을 저장하고, 범위를 벗어나면 "유효하지 않은 점수입니다."라고 출력해야 합니다.
main 함수에서 Score 객체를 생성하고, setScore(85)와 setScore(120)를 각각 호출하여 결과가 올바르게 나오는지 확인하세요.

[문제 3] 읽기 전용 필드 만들기
BankAccount 클래스를 만드세요. private 접근 제한자를 가진 accountNumber(문자열) 멤버 변수를 가집니다.
객체를 생성할 때만 계좌번호를 설정할 수 있도록, accountNumber를 초기화하는 생성자를 만드세요.
계좌번호를 외부에서 읽을 수만 있도록 public 접근 제한자를 가진 getAccountNumber() 메소드(Getter)만 정의하세요. (Setter는 만들지 않습니다.)
main 함수에서 "123-456"을 계좌번호로 가진 객체를 생성하고, getAccountNumber()로 계좌번호를 출력하여 확인하세요.

*/