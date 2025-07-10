package day08;

public class Pet {
    // 멤버변수
    String name;    // 이름
    String species; // 품종
    int age;        // 나이

    // 생성자 : name, species, age를 매개변수로 받아
    Pet( String name , String species , int age ){
        // 초기화하는 생성자
        this.name = name;
        this.species = species;
        this.age = age;
    }

} // class end
