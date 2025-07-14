package 종합.예제8.controller;

import 종합.예제8.model.dao.BoardDao;

public class BoardController {
    // 1) 싱글톤
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    // 2) dao 싱글톤 가져오기
    private BoardDao boardDao = BoardDao.getInstance();

    // 3) 등록 기능 구현
    public boolean addBoard( String content , String writer ){
        boolean result = false;
            // 1) dao 에게 매개변수를 전달하고 결과(리턴) 값을 받는다.
        result = boardDao.addBoard( content , writer );
        return result;
    }

} // class end
