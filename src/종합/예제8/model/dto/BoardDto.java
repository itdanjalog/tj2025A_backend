package 종합.예제8.model.dto;

public class BoardDto {
    // 1. 멤버변수 : 데이터 모델링의 속성 참고 , private
    private String content; // 내용
    private String writer; // 작성자
    // 2. 생성자
    public BoardDto() {  }
    public BoardDto(String writer, String content) {
        this.writer = writer;
        this.content = content;
    }
    // 3. 메소드
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    @Override
    public String toString() {
        return "BoardDto{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
} // CLASS END
