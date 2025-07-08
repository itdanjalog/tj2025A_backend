package boardService.step4_메소드; // 패키지명

import java.util.Scanner;



public class BoardService4 { // class start
	public static void main(String[] args) { // main start 

		BoardController bs = new BoardController();

		while(true) { // w s
			System.out.print("1.등록 2.출력 : ");
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();

			if( choose == 1 ) {
				// [1] 입력받기
				System.out.print("내용 : ");
				String content = scan.next();
				System.out.print("작성자 : ");
				String writer = scan.next();
				boolean result = bs.doPost( content , writer );
				if( result ) { System.out.println("등록 성공했습니다.");}
				else { System.out.println("등록 실패했습니다.");}

			}else if( choose == 2 ) {
				Board[] result = bs.doGet();
				for( int index = 0 ; index <= result.length - 1 ; index++ ) {
					Board board = result[index];
					if( board != null ) {
						System.out.printf("내용 : %s , 작성자 : %s \n" ,
								board.content , board.writer );
					}
				} // for end
			}

		} // w end
	}// main end 
} // class end 







