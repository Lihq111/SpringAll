package pojo;

public class PetFactory {
    public  Cat getCat(){
        return new Cat();
    }
    public  Dog getDog(){
        return new Dog();
    }
    public  Pet getPet(String name){
        if (name.equals("cat")){
            return new Cat();
        }else
            return new Dog();
    }
}
