package pojo;



import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author LHQ
 * @description :
 */
public class Cat extends Pet {
    private String name;
    private int age;
    private String[] arr;
    private List<Dog> lists;
    private Set<Dog> sets;
    private Map<String, String> maps;
    private Dog dog;

    @Override
    public void show(){
        System.out.println("喵喵————————————————————");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String[] arr, List<Dog> lists, Set<Dog> sets, Map<String, String> maps, Dog dog) {
        this.name = name;
        this.age = age;
        this.arr = arr;
        this.lists = lists;
        this.sets = sets;
        this.maps = maps;
        this.dog = dog;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<Dog> getLists() {
        return lists;
    }

    public void setLists(List<Dog> lists) {
        this.lists = lists;
    }

    public Set<Dog> getSets() {
        return sets;
    }

    public void setSets(Set<Dog> sets) {
        this.sets = sets;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
