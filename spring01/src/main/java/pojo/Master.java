package pojo;

import javax.swing.*;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Master {
    private String name;
    private Integer age;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private Cat cat;
    private Map map;
    private List list;

    public Master() {
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", cat=" + cat +
                ", map=" + map +
                ", list=" + list +
                '}';
    }

    public Master(String name, Integer age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public Master(String name, Integer age, Cat cat) {
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public Master(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Cat getCat() {
        return cat;
    }

    public Map getMap() {
        return map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String sayHello() {
        System.out.println("hello world");
        return "Hello";
    }

}
