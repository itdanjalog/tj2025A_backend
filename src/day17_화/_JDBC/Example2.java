package day17_화._JDBC;

import java.util.List;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {

		UserDao dao = UserDao.getInstance();

		UserDto dto = new UserDto( 0 , "유재석", 30 );
		dao.insert( dto );
		dao.select();

		UserDto dto2 = new UserDto( 1 , "강호동"  , 0 );
		dao.update( dto2 );
		dao.select();

		dao.delete( 1 );
		dao.select();

		for( ; ; ){
			Scanner scan = new Scanner(System.in);
			System.out.println("-----");
			System.out.print("1.등록 2.출력 3.수정 4.삭제 : ");
			int ch = scan.nextInt();
			if( ch == 1 ){
				System.out.print(">>[저장C] 이름 : "); String name = scan.next(); // 1.입력받고
				System.out.print(">>[저장C] 나이 : "); int age = scan.nextInt();
				UserDto userDto = new UserDto( 0 , name , age );
				boolean result = dao.insert( userDto );
				System.out.println( result );
			}
			else if( ch == 2 ){
				System.out.println("===== 이름 명단 ===== ");
				// 2. DB SQL 레코드 전체 검색/조회  :  "select * from table1"
				List<UserDto> result =  dao.select();
				System.out.println( result );
			}
			else if( ch == 3 ) {
				System.out.print("[수정U] 번호 : "); 		int no = scan.nextInt();
				System.out.print("[수정U] 새로운이름 : ");     String name = scan.next();
				UserDto userDto = new UserDto( no , name , 0 );
				boolean result = dao.update( userDto );
				System.out.println( result );
			}
			else if( ch == 4 ){
				System.out.print(">>[삭제D] 이름 : "); int no = scan.nextInt();
				boolean result = dao.delete( no );
				System.out.println( result );

			}

		}


	} // main end 
} // class end 
