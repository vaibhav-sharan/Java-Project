package com.Practical.collections;
import java.util.*;

public class HashMapFilter {
    public static void main(String[] args) {
        System.out.println("Hello");
        Map<String, Integer> hm = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a",100);
        hm.put("c",200);
        hm.put("b",300);
        hm.put("d",400);

//        System.out.println(hm);
//        System.out.println(hm.entrySet());

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hm);
//        System.out.println(linkedHashMap.entrySet());
        for(Map.Entry<String,Integer> me: hm.entrySet()){
            System.out.println(me.getKey());
//            System.out.println(me.getValue());
        }
    }
}
