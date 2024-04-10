package com.Practical.Program;

import java.util.ArrayList;

public class FactorialOfNumber {

    public static void main(String[] args) {
        int number = 4;
        ArrayList<Integer> fact = new ArrayList<>();
        for(int i=1;i<=number;i++){
//            System.out.println(i);
            fact.add(i);
        }
        System.out.println(fact);

        int k=0;
        for(int j:fact){
            j=j* fact.get(k);
            k+=1;
            System.out.println(j);
        }
    }
}
