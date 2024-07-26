package pojo;

/**
 * @author LHQ
 * @description :
 */

public class PetShop {
    public  Pet getCat() {
        return new Cat();
    }

    public  Pet getDog() {
        return new Dog();
    }

    public  Pet getPet(String string) {
        if (string.equals("cat")) {
            return new Cat();
        } else {
            return new Dog();
        }
    }

}
