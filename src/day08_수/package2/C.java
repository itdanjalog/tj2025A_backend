package day08_수.package2;

import day08_수.package1.A;

// 다른 패키지에 있는 C 클래스
public class C {
    public void testAccess() {
        System.out.println("\n--- 다른 패키지(C)에서 A에 접근 ---");
        A a = new A();
        System.out.println("publicVar 접근: " + a.publicVar);           // O
        // System.out.println("defaultVar 접근: " + a.defaultVar);     // X 오류! 다른 패키지이므로 접근 불가
        // System.out.println("privateVar 접근: " + a.privateVar);     // X 오류! 당연히 접근 불가
    }
}

