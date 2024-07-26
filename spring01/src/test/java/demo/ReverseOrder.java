package demo;

import java.util.*;

public class ReverseOrder {
    public static void main(String[] args) {
        Integer[] array = {5, 3, 8, 1, 2};
        List<String> arrayList = new ArrayList();
        List list = new ArrayList(arrayList);
        List<Integer> integers = Arrays.asList(array);
        int max =(int)Collections.max(integers);
        int min = (int) Collections.min(Arrays.asList(array));
        System.out.println(max+":"+min);
        // 使用 lambda 表达式降序排序
        Arrays.sort(array, (a, b) -> b - a);
        Arrays.sort(array, Comparator.reverseOrder());
        // 打印排序后的数组
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}