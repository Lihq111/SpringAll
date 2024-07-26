package demo;

import java.util.HashSet;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
//        Integer[] integerArray = Arrays.stream(array)
//                .boxed()
//                .toArray(Integer[]::new);
        //Arrays.sort(array, Comparator.<Integer>reverseOrder());//可能是版本导致的问题
        //使用lambda表达式实现上面的降序排序表达式

        //Arrays.sort(array, (a, b) -> (b - a));
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        for (int i : array) {
            System.out.println(i);
        }
        Integer[] integers = {1, 2, 3, 4, 5};
        //reverse2(array, array.length);
        //reverse3(integers);

        //java8新特性foreach，方法应用::结合,遍历集合，减少冗余。
        HashSet<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.forEach(System.out::println);
    }

    //定义一个新的数组，将原数组的元素按倒序一个个赋值给新数组，从而得到一个倒序的数组
    public static void reverse(int[] a, int length) {
        int[] b = new int[length];
        int j = length;
        for (int i = 0; i < length; i++) {
            b[j - 1] = a[i];//将数组a的第一个元素赋值给数组b的最后一个元素，以此类推
            j--;
        }
        System.out.println("反转后的数组：");

        for (int i = 0; i < b.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(b[i]);
            if (i < b.length - 1) {
                System.out.print(",");
            }
            if (i == length - 1) {
                System.out.print("]");
            }
        }

    }

    /**
     * 遍历数组，交换第一个和最后一个元素，再交换第二个和倒数第二个元素，以此类推，执行一般数组长度的次数即可
     * 得到一个倒序的数组
     */
    public static void reverse2(int[] a, int Length) {
        int temp, i, j;
        for (i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[Length - 1 - i];
            a[Length - 1 - i] = temp;
        }
        for (j = 0; j < Length; j++) {
            System.out.println(a[j]);
        }
    }

    /**
     * 使用泛型设计一个倒序数组的方法函数
     */
    public static <T> void reverse3(T[] array) {
        T t;
        for (int i = 0; i < array.length / 2; i++) {
            t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
