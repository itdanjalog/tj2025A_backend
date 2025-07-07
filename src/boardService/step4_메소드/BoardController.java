package boardService.step4_메소드;

import java.util.Scanner;

public class BoardController { // class s

	// (2) 게시물 객체 여러개를 저장하는 배열 생성
	Board[] boards = new Board[100];

	// 1. 멤버변수 
	// 2. 메소드/멤버함수
	//반환타입 함수명( 타입 매개변수~ ){}
	boolean doPost( String content , String writer ) { // m s
		// [2] 객체 생성 
		Board board = new Board();
		board.content = content;
		board.writer = writer;
		// [3] 객체를 배열에 저장
		boolean saveState = false;
		for( int index = 0 ; index<boards.length-1 ; index++) {
			if( boards[index] == null ) {
				boards[index] = board;
				saveState = true;
				break;
			}
		}
		return saveState;

	} //  m end 
	
	Board[] doGet( ) { // m s
		return boards;
	}// m end
	
} // class e 






