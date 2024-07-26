package pojo;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        for (String s : map.keySet()) {
            System.out.println(s+":"+map.get(s));
        }
        map.forEach((key,value)->System.out.println(key+":"+value));
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        System.out.println("++++++++++++++++++++++++++++++++");
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
            System.out.println(iterator.next().getKey()+":"+iterator.next().getValue());
        }
    }
}
