package day08_수.package1;

 // 같은 패키지에 있는 B 클래스
public class B {
    public void testAccess() {
        System.out.println("\n--- 같은 패키지(B)에서 A에 접근 ---");
        A a = new A();
        System.out.println("publicVar 접근: " + a.publicVar);       // O
        System.out.println("defaultVar 접근: " + a.defaultVar);     // O
        // System.out.println("privateVar 접근: " + a.privateVar); // X 오류! private은 접근 불가
    }
}