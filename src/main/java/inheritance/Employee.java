package inheritance;

import javax.xml.namespace.QName;

public class Employee extends Person {


    private String employeId;
    private String title;

    public Employee() {
        super("john");


        System.out.println("In Employee default constructor");

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }
}
