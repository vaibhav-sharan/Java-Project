package com.Practical.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();

        for(int i=1;i<10;i++){
            lst.add(i);
        }
        System.out.println(lst);
        Stream<Integer> sm = lst.stream();
        List<Integer> lst1 = sm.filter(i -> i > 5).collect(Collectors.toList());
        System.out.println(lst1);

    }
}
