package 종합.예제10;

import 종합.예제10.controller.BoardController;
import 종합.예제10.model.dto.BoardDto;
import 종합.예제10.view.BoardView;

import java.util.ArrayList;

public class AppStart {
    public static void main(String[] args) {
        // 1. 20250723 등록 테스트
        boolean result = BoardController.getInstance().boardWrite("테스트내용","강사");
        System.out.println( result );

        // 2. 20250723 전체조회 테스트
        ArrayList<BoardDto> result2 = BoardController.getInstance().boardPrint();
        System.out.println( result2 );

        // 3. 20250723 특정삭제 테스트 , 삭제가 성공하면 true 실패or존재하지않으면 false
        boolean result3 = BoardController.getInstance().boardDelete( 2 );
        System.out.println( result3 );

        // * 메인화면 호출
        BoardView.getInstance().index();
    }
}
