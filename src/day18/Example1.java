package day18;

public class Example1 {
    public static void main(String[] args) {

        // (1) DB연동 확인
        UserDao userDao = UserDao.getInstance();

        // (2) 연동된 db에 메소드 실행
        userDao.userInsert();

    }
}
