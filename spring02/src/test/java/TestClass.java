import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestClass {
    public static void main(String[] args) {
        String[] coins = {"B", "A", "C", "D", "E"};
        List<String> l = new ArrayList<>();
        List<String> copy = new CopyOnWriteArrayList<>();
        Collections.addAll(l, coins);
        Collections.addAll(copy, coins);
        ListIterator<String> liter = l.listIterator();
        ListIterator<String> copyListIterator = copy.listIterator();
        System.out.println("反转前");
        while (liter.hasNext())
            System.out.println(liter.next());
        System.out.println("反转后");
        while (copyListIterator.hasNext()) {
            copy.add("2");
            copy.set(0, "1");
            copy.remove(2);
            System.out.println(copyListIterator.next());
        }
        copy.forEach(System.out::print);
    }

    @Test
    public void test() {
        String[] split = "31,2,3,4,5,6,7,8".split(",");
        List<String> strings = Arrays.asList(split);
        //System.out.println(Collections.max(strings));
        //System.out.println(Collections.min(strings));
        //strings.sort(Comparator.naturalOrder());
        //System.out.println(strings.get(0)+":"+strings.get(strings.size()-1));
        //strings.sort(Comparator.reverseOrder());
        Collections.sort(strings);
        System.out.println(strings);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        // 打印排序前的集合
        System.out.println("排序前: " + numbers);

        // 对集合进行排序
        Collections.sort(numbers);
        System.out.println(numbers.get(0));
        // 打印排序后的集合
        //System.out.println("排序后: " + numbers);
    }


    @Test
    public void mains() {
        List<String> list = Arrays.asList("one Two three Four five six".split(" "));
        System.out.println("List :" + list);
        Collections.rotate(list, 3);
        System.out.println("rotate: " + list);
    }

    @Test
    public void hashTable() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "111");
        hashMap.put("2", "222");
        hashMap.put("3", "333");

        Hashtable<String, String> hashTable = new Hashtable<>(hashMap);
        hashTable.forEach((k, v) -> System.out.println(k + ":" + v));

        hashTable.put("4", "11");
        hashTable.put("5", "22");
        hashTable.put("6", "33");
        Enumeration<String> keys = hashTable.keys();
        //String s = keys.nextElement();
        while (keys.hasMoreElements()) {
            System.out.println(hashTable.get(keys.nextElement()));
            // System.out.println(s+":"+hashTable.get(s));
        }

    }

    @Test
    public void replace() {
        List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :" + list);
        //Collections.replaceAll(list, "one", "replace");
        list.sort(Collections.reverseOrder());
        System.out.println("replaceAll: " + list);
    }

    @Test
    public void a() {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("1");
        lList.add("8");
        lList.add("6");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);
        List<String> clone = (List<String>) lList.clone();
        clone.subList(0, 2).clear();
        System.out.println(clone);
        //clone.add("8");
        System.out.println(Collections.indexOfSubList(lList, clone));
        //lList.subList(2, 4).clear();
        lList.subList(0, 2).clear();
        System.out.println(lList);
    }

    @Test
    public void reverse1() {
        String str = "abxcdefg";
        char[] chars = str.toCharArray();
        Arrays.sort(chars, 2, 8);
        System.out.println(Arrays.toString(chars));
    }



}