package day08_수;

import day08_수.package1.A;
import day08_수.package1.B;
import day08_수.package2.C;

public class Example2_접근제한자 {
    public static void main(String[] args) {
        /*
         * =======================================================================
         * [ 접근 제한자 핵심 요약 ]
         * - public    : 완전 공개. 프로젝트 어디서든 접근 가능.
         * - default   : 이웃 공개. 같은 패키지 내에서만 접근 가능. (아무것도 안 쓰면 default)
         * - private   : 나만 보기. 해당 클래스 내부에서만 사용 가능.
         * =======================================================================
         */

        // 1. A 클래스 내부에서 private 멤버 접근 확인
        A a_instance = new A();
        a_instance.checkPrivate();

        // 2. 같은 패키지 클래스(B)의 접근 테스트
        B b_instance = new B();
        b_instance.testAccess();

        // 3. 다른 패키지 클래스(C)의 접근 테스트
        C c_instance = new C();
        c_instance.testAccess();
    }
}
//접근제한자 멤버변수명
//접근제한자 함수명
//접근제한자 생성자
//접근제한자 클래스
//접근제한자 인터페이스
//
//- 접근제한자 : 다른 클래스로부터 접근 허용 여부
//
//public                (,동일패키지,다른패키지)프로젝트내 모든 곳에서 접근 가능.
//protected             (,동일패키지,*다른패키지)같은 패키지(폴더) 내에서 접근 가능.
//                        단) 자식 클래스가 다른 패키지에 존재하면 자식클래스는 가능
//생략시(default)        (,동일패키지)같은 패키지(폴더) 내에서 접근 가능
//private               ()현재 클래스내에서만 접근 가능