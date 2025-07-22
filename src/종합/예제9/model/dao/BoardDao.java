package 종합.예제9.model.dao;

import 종합.예제9.model.dto.BoardDto;
import java.util.ArrayList;

public class BoardDao {
    // (*)싱글톤 : 지정한 클래스내 하나의객체를 미리 만들고 프로그램내 하나의 객체만 존재
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // (*) DB 대신할 리스트 선언 < 추후에 사용하지 않음 >
    ArrayList<BoardDto> boardDB = new ArrayList<>();
    // (1) 등록
    public boolean boardWrite( BoardDto boardDto ){
        // boolean : 반환타입 으로 성공시 true 실패시 false
        // boardWrite : 임의의 함수명
        // BoardDto boardDto : 매개변수
        boardDB.add( boardDto ); // 1. 리스트(db)에 DTO를 저장한다.
        return true; // 2. 성공시 true 반환한다. true 의 타입은 boolean 타입이다.
    } // func end
    // (2) 전체조회
    public ArrayList<BoardDto> boardPrint(){
        // ArrayList<BoardDto> : 반환타입 으로 모든 dto를 반환한다.
        return boardDB; // boardDB 변수의 타입은 ArrayList<BoardDto> 이다.
    } // func end

} // class end











