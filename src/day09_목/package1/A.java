package day09_목.package1;

// 기준이 되는 A 클래스
public class A {
    // [1] 3가지 접근 제한자로 멤버 변수 선언
    public    int publicVar    = 1; // public:   어디서든 접근 가능
    int defaultVar   = 3; // (default): 같은 패키지까지만
    private   int privateVar   = 4; // private:   오직 이 A 클래스 내부에서만

    // private 멤버는 외부에서 직접 접근할 수 없으므로, 내부에서만 사용하는 예시
    public void checkPrivate() {
        System.out.println("A 클래스 내부에서 privateVar 접근: " + this.privateVar);
    }
}
