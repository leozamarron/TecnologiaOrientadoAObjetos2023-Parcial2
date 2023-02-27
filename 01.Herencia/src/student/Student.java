package student;
import person.Person;

public class Student extends Person {

    private String code; // package private

    
    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}