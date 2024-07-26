package pojo;

import org.springframework.stereotype.Component;

/**
 * @author LHQ
 * @description :
 */
public class Master {
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void sayHello() {
        System.out.println("Hello Master!");
    }
}
