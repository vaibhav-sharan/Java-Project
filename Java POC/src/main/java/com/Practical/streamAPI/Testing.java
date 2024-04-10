package com.Practical.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testing {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(2,4,50,21,22,67);
        List<Integer> list2 =new ArrayList<>();

        //1st way
        for (int i:list1){
            if(i % 2==0){
                list2.add(i);
            }
        }

        //2nd way
        Stream<Integer> stream = list1.stream();
        List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);

        //3rd way
        List<Integer> collect1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect1);

        //4th way
        List<Integer> collect2 = list1.stream().filter(i -> i >= 50).collect(Collectors.toList());
        System.out.println(collect2);


    }
}
