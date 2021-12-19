package ss12_collection_framework.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Hoang",22);
        hashMap.put("Khoa",18);
        hashMap.put("Dong",26);
        hashMap.put("Loc",31);
        System.out.println("Display entries in HashMap : ");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Hoang",22);
        linkedHashMap.put("Khoa",18);
        linkedHashMap.put("Dong",26);
        linkedHashMap.put("Loc",31);
        System.out.println("\nThe age for " + "Khoa is " + linkedHashMap.get("Khoa"));
    }
}
