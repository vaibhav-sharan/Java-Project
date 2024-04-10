package com.Practical.Program;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Hello");

        int num = 1234;
        int rem,rev=0;


        while(num>0){
            rem = num%10;
            rev = rev*10+rem;
            System.out.println(rev);
            num = num/10;
        }

    }
}
