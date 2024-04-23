package com.Practical.streamAPI;

import java.util.HashMap;
import java.util.Map;

public class MapPracticle {
    public static void main(String[] args) {
        // Creating a HashMap to store key-value pairs
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs to the map
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        System.out.println(ageMap);

        System.out.println(ageMap.entrySet());

        // Fetching values using Stream API with filter
//        ageMap.entrySet().stream()
//                .filter(entry -> entry.getValue() > 25) // Filter entries with value greater than 25
//                .forEach(entry -> System.out.println(entry.getKey() + "'s age is " + entry.getValue()));
    }
}