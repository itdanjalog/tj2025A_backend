package day07;

public class Lamp {
    boolean isOn;     // 멤버변수
    void turnOn(){ // 메소드
        isOn = true; System.out.println( isOn );
    } // func end
    void turnOff(){
        isOn = false; System.out.println( isOn );
    } // func end
} // class end

