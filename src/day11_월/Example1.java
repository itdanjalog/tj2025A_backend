package day11_월;

import java.util.ArrayList;

//class Book {
//
//	//1.멤버변수
//	private String bookName;
//	private String author;
//	//2.생성자
//	public Book() {}
//	public Book( String bookName , String author ) {
//		this.bookName = bookName;
//		this.author = author;
//	}
//	//3.메소드
//	public String getBookName() { return this.bookName; }
//	public String getAuthor() { return this.author; }
//	public void setBookName( String bookName ) {
//		this.bookName = bookName;
//	}
//	public void setAuthor( String author ) {
//		this.author = author;
//	}
//
//} // class end

// 예제에서 사용할 Book 클래스
class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// 객체 정보를 쉽게 확인하기 위해 toString() 메소드를 재정의합니다.
	@Override
	public String toString() {
		return "Book{title='" + title + "', author='" + author + "'}";
	}
}



public class Example1 { // class start 
	public static void main(String[] args) { // main start 

		/*
		 * =======================================================================
		 * [ 파트 0. 왜 ArrayList가 필요할까요? - "크기가 늘어나는 마법 주머니" ]
		 * =======================================================================
		 *
		 * 기본 배열은 한 번 크기를 정하면 바꿀 수 없는 '플라스틱 계란판'과 같았습니다.
		 * 하지만 실제 프로그램에서는 데이터가 몇 개가 될지 모르는 경우가 많습니다.
		 *
		 * ArrayList는 이런 상황을 위해 만들어진, 크기가 자동으로 조절되는 '가변 길이' 배열입니다.
		 *
		 * [비유: 쇼핑 카트]
		 * - 기본 배열: 정해진 칸 수만 있는 작은 바구니. 물건을 더 담으려면 더 큰 새 바구니로 옮겨야 함.
		 * - ArrayList: 물건을 담을 때마다 크기가 쭉쭉 늘어나는 마법 쇼핑 카트. 추가/삭제가 매우 자유로움.
		 */

		System.out.println("--- [ArrayList 문법 마스터 클래스를 시작합니다!] ---");

		// --- 1. ArrayList 생성과 기본 사용법 ---
		System.out.println("\n--- 1. ArrayList 생성 및 기본 메소드 ---");

		// [1] ArrayList 생성하기
		// - 문법: ArrayList<요소의타입> 변수명 = new ArrayList<>();
		// - < > 제네릭: 이 리스트에 어떤 타입의 데이터만 저장할 것인지 명시합니다.
		ArrayList<String> nameList = new ArrayList<>();

		// [2] 요소 추가하기 : .add(요소)
		// - 리스트의 가장 마지막 순서에 새로운 요소를 추가합니다.
		nameList.add("유재석");
		nameList.add("강호동");
		nameList.add("신동엽");

		nameList.add( 0, "박명수");
		System.out.println("초기 리스트 상태: " + nameList);

		// [3] .set();
		nameList.set( 0 , "이명수" );
		System.out.println("초기 리스트 상태: " + nameList);

		// [3] 리스트 크기 확인하기 : .size()
		// - 배열의 .length 와 같은 역할입니다. 리스트에 저장된 요소의 총 개수를 반환합니다.
		System.out.println("현재 리스트의 크기(요소 수): " + nameList.size());

		// [4] 특정 위치의 요소 가져오기 : .get(인덱스)
		// - 배열의 '변수명[인덱스]' 와 같은 역할입니다.
		System.out.println("1번 인덱스의 요소: " + nameList.get(1));

		// [5] 요소 삭제하기 : .remove(인덱스)
		// - 지정한 인덱스의 요소를 삭제합니다. 삭제 후 리스트의 크기는 자동으로 줄어듭니다.
		nameList.remove(1); // 1번 인덱스("강호동") 삭제
		System.out.println("'강호동' 삭제 후 리스트 상태: " + nameList);
		System.out.println("삭제 후 리스트 크기: " + nameList.size());


		// --- 2. 반복문과 ArrayList ---
		System.out.println("\n--- 2. 반복문으로 리스트 순회하기 ---");
		// .size()와 .get()을 이용하면 배열과 똑같이 반복문을 사용할 수 있습니다.
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(i + "번 인덱스: " + nameList.get(i));
		}

		// --- 3. 객체를 저장하는 ArrayList ---
		System.out.println("\n--- 3. 객체를 저장하는 ArrayList 활용 ---");
		// String 뿐만 아니라 우리가 만든 클래스의 객체도 저장할 수 있습니다.
		ArrayList<Book> library = new ArrayList<>();

		// [1] 리스트에 Book 객체 추가하기
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("어린왕자", "생텍쥐페리"));

		System.out.println("\n[도서관 현재 도서 목록]");
		// [2] 향상된 for문(Enhanced for loop)으로 리스트 순회하기
		// - 'for (타입 변수명 : 리스트/배열)' 형태로, 0번 인덱스부터 마지막까지 알아서 순회해주는 편리한 구문입니다.
		for (Book book : library) {
			System.out.println("제목: " + book.title + ", 저자: " + book.author);
		}

		// ★★★ 결론: 데이터의 개수가 유동적이거나, 추가/삭제가 빈번하게 일어나는 상황에서는
		// 고정 길이 배열보다 ArrayList를 사용하는 것이 훨씬 강력하고 효율적입니다. ★★★

	} // main end 
} // class end 
























