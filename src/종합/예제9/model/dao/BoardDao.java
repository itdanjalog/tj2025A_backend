package 종합.예제9.model.dao;

import 종합.예제9.model.dto.BoardDto;
import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // DB 대신할 리스트 선언
    ArrayList<BoardDto> boardDB = new ArrayList<>();

}
