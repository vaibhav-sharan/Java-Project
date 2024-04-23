package com.Practical.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //Stream API - collection process
        //collection / group of object

        //1 -blank object
        Stream<Object> empty = Stream.empty();
//        empty.forEach(e ->{ System.out.println(e); } );
//        System.out.println(empty);

        //2- way array object
        String name[] = {"Vaibhav","Durgesh","Uttam","Ankit"};
        Stream<String> name1 = Stream.of(name);
//        name1.forEach(i->{System.out.println(i);});
//        Or
//        name1.forEach(System.out::println);

        //3rd way using builder
        Stream<Object> build = Stream.builder().build();
        System.out.println(build);

        //4th using Array
        IntStream stream = Arrays.stream(new int[]{2, 4, 6, 8, 55});
//        stream.forEach(i ->{System.out.print(i);});


        //5th
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(66);
        list1.add(8);
        list1.add(7);
        list1.add(9);

        list1.stream().forEach(i -> {System.out.println(i);});
        //or
        list1.stream().forEach(System.out::println);

        //


    }
}
