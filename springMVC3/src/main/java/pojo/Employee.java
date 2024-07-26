package pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author LHQ
 * @description :
 */
@XmlRootElement(name = "employee")
public class Employee {
    private int id;
    private String name;
    private String email;
    private Dept dept;

    public Employee() {
    }

    public Employee(int id, String name, String email, Dept dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

}
