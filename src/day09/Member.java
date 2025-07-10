package day09;

public class Member {
    // 1. 멤버변수 : 접근제한자 타입 변수명;
    private String id;
    // 2. 생성자
    // 3. 메소드 : 접근제한자 반환타입 메소드명(){}
    // 1) setter 메소드
    public void setId( String id ){
        this.id = id;
    }
    // 2) getter 메소드
    public String getId( ){
        return this.id;
    }
} // class end
