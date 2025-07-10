package 종합.예제6;

// (2) 컨트롤러 : 기능/제어
public class BoardController { // class start
    // 1. 멤버변수
    private static final Board[] boards = new Board[100];
        // private : 현재 클래스에서만 접근 키워드
        // static : 객체 없이 접근 가능한 키워드
        // final : 수정 불가능 키워드
    // 3. 메소드
    // 1) 등록 메소드 :  // public 다른 클래스에서 접근
    public static boolean doPost( String content , String writer ){
        Board board = new Board( content , writer ); // (1) 매개변수로 객체를 생성한다.
        // (2) 배열(boards)내 빈공간을 찾아서 생성한 객체 대입한다.
        for( int i = 0 ; i<boards.length ; i++ ){
            if( boards[i] == null ){
                boards[i] = board;
                return true; // 저장성공 뜻을 true로 부여하여 반환
            } // if end
        }
        return false; // 저장실패 뜻을 false 로 부여하여 반환
    }
    // 2) 조회 메소드
    public static Board[] doGet( ){
        return boards;
    }
} //  class end
