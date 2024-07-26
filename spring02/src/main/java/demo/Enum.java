package demo;

import java.util.concurrent.Callable;

/**
 * @author LHQ
 * @description :枚举
 */
public class Enum {
    enum Animals {
        dog("旺财", 1), cat("小猫", 2), bird("小鸟", 3);
        private String name;
        private int age;

        Animals(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;

        }
    }

    public static void main(String[] args) {
        for (Animals animals : Animals.values()) {
            int age = animals.getAge();
            String name = animals.getName();
            System.out.println(animals+"叫"+name+"今年"+age+"岁了");
        }
    }
}
