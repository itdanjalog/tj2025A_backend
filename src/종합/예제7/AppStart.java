package 종합.예제7;

import 종합.예제6.Board;
import 종합.예제7.view.BoardView;

// (역할) 프로그램 시작 클래스
public class AppStart {
    public static void main(String[] args) {
        // [ boardView index() 호출하는 방법 ]
        // 1. 메소드가 static 이면
        // BoardView.index();
        // 2. 메소드가 static 아니면
        // BoardView view = new BoardView();
        // view.index();
        // 3. 해당 클래스가 싱글톤 이면
//        BoardView 싱글톤 = BoardView.getInstance();
//        싱글톤.index();
                // vs
        BoardView.getInstance().index();

    } // main end
} // class end






