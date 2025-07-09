package 종합.예제5;

// (2) (게시물 이벤트) 기능 제어/로직 담당
public class BoardController {

    Board[] boards = new Board[100];

    // 1. 등록 이벤트 : 입력받은 자료를 받아서 객체를 생성하여 배열에 저장
    // 메소드 이름 : doPost
    // 매개변수 : 저장할 내용 과 작성자  , String content , String writer
    // 반환값 : 성공/실패 == boolean   , boolean

    // 2. (출력) 조회 이벤트 : 현재 저장된 모든 객체들을 가지고 있는 배열 호출
    // 메소드 이름 : doGet
    // 매개변수 : x                     , x
    // 반환값 : boards                  , Board[]


}
// 담당이 필요한 이유!! : 복잡한 로직/코드를 역할/담당 나누어 유지보수 관리 한다.
// 1인식당은 테이블 3개라서 사장님 혼자서 주문받고,요리하고,냉장고관리
// 테이블 100개라서 역할/담당 : 1.서빙담당(main) 2. 요리사담당(BoardController) 3. 재고관리담당(board)
