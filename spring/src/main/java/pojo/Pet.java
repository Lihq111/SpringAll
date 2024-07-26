package pojo;

/**
 * @author LHQ
 * @description :
 */
public class Pet {
    private String name;
    private int age;

    public void show() {
        System.out.println("______________________________");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
