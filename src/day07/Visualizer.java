package day07;

public class Visualizer {
    String getStars( int x ){
        String 문자열 = ""; // '매개변수 x' 숫자만큼 "★" 문자를 반복
        for( int i = 1 ; i <= x ; i++ ){
            문자열 += "★"; // 한번씩 1부터 x까지 별 누적한다.
        } // for end
        return 문자열; // 최종적인 문자열 반환
    } // func end
} // class end












