package bean;


public class Persona {

    private Integer code;
    private String name;
    private String lasname;

    public Persona(Integer code, String name, String lasname) {
        this.code = code;
        this.name = name;
        this.lasname = lasname;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }
}
