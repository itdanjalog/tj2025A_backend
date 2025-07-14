package 종합.예제8.view;

import 종합.예제8.controller.BoardController;

public class BoardView {
    // 1) 싱글톤
    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){
        return instance;
    }
    // 2) controller 싱글톤 가져오기
    private BoardController boardController = BoardController.getInstance();

}
