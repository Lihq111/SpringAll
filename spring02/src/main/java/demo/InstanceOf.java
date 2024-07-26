package demo;

/**
 * @author LHQ
 * @description :实例
 */
public class InstanceOf {
    public static void main(String[] args) {
        /*ArrayList<Object> objects = new ArrayList<>();
        System.out.println(objects instanceof ArrayList);*/
        String[] strings = {"A", "B", "C"};
        switch (strings[1]) {
            case "A":
                System.out.println("AAAAAAAAAAAAA");
            case "B":
                System.out.println("BBBBB");
                break;
        }
        outer:
        System.out.println("厉害");
        outerLoop:
        for (int i = 0; true; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1 && i == 1)
                    break outerLoop;
                System.out.println(i + "和" + j);
            }
        }
    }
}
