package day17_화._JDBC;

public class UserDto {
    private int uno;
    private String uname;
    private int uage;

    public UserDto() {
    }

    public UserDto(int uno, String uname, int uage) {
        this.uno = uno;
        this.uname = uname;
        this.uage = uage;
    }

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "uno=" + uno +
                ", uname='" + uname + '\'' +
                ", uage='" + uage + '\'' +
                '}';
    }
}
