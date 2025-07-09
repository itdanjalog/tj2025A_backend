package day08;

public class Book {
    // 멤버변수
    String title;   // 이름
    String author;  // 저자
    int price;   // 가격

    // 생성자 : title, author, price를 매개변수로 받아
    Book( String title , String author , int price ){
        // 멤버 변수를 초기화하는
        this.title = title;
        this.author = author;
        this.price = price;
    } // end

} // class end
