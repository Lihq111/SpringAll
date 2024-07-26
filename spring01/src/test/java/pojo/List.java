package pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        String[] str = {"11","2","3"};

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (String s : str) {
            linkedList.add(Integer.parseInt(s));
        }
        Object clone = linkedList.clone();
        System.out.println(clone);
        Object[] array = linkedList.toArray();
        System.out.println(array[0]);
//        Integer remove = linkedList.remove();
//        System.out.println("remove"+remove);
        System.out.println("linkedList:"+linkedList);
        arrayList.add("a");
        arrayList.add("b");
        arrayList2.add("d");
        arrayList2.add("c");
        arrayList2.add("b");
        if (arrayList.addAll(arrayList2)){
            for (String s : arrayList) {
                System.out.println(s);
            }
        }
        //String[] strings = arrayList.toArray(str);
        for (int i=0;i<arrayList.size();i++){
            System.out.println("----------"+arrayList.get(i));
        }
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator"+iterator.next());
        }
        for (String s : arrayList) {
            if (s.equals("b")){
                System.out.println("有个B");
                break;
            }else {
                System.out.println(s);
            }
        }

        Collections.sort(arrayList);//对数组队列进行排序
        System.out.println(arrayList);
//        boolean c = arrayList.contains("c");
//        System.out.println(c);
        //System.out.println(arrayList.indexOf("b"));
//        arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
        System.out.println(arrayList2);
//        for (String s : arrayList) {
//            if (s.equals("b")){
//                arrayList.remove(s);
//            }
//        }
        System.out.println(arrayList+"qqqqqqqqqqqqqqqqqqqqqqqqqqq");
//        for (String s : arrayList2) {
//            for (String s1 : arrayList) {
//                if (s.equals(s1)){
//                    arrayList.remove(s1);
//                }
//            }
//        }
        Iterator<String> iterator2 = arrayList2.iterator();
        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator2.hasNext()) {
            String next2 = iterator2.next();
            boolean contains = arrayList.contains(next2);
            if (contains) {
                arrayList.remove(next2);
            }
        }

        System.out.println(arrayList);
    }
}
