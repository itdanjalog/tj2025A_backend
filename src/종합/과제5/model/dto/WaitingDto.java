package 종합.과제5.model.dto;

public class WaitingDto {
    // 1. 멤버변수 : 설계 기반으로 구성한 속성
    private String phone;
    private int count;
    // 2. 생성자
    public WaitingDto() {}
    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }
    // 3. 메소드

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}
