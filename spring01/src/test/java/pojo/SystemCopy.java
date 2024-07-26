package pojo;

public class SystemCopy {

    public static void main(String[] args) {
        String[] names = new String[]{"A", "B", "C"};
        String[] extended = new String[5];
        extended[0] = "E";
        extended[1] = "E";
        extended[2] = "E";
        extended[3] = "E";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str : extended) {
            System.out.println(str);
        }
    }

}
