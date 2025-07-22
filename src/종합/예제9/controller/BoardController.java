package 종합.예제9.controller;

public class BoardController {

    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }

}
