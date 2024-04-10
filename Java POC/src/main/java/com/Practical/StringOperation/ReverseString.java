package com.Practical.StringOperation;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Vaibhav123sharan";
        List<Object> reversedChars=new ArrayList<>();

        //reverse the string
        for (int i = name.length()-1; i >= 0; i--) {
            reversedChars.add(name.charAt(i));
        }
        System.out.println(reversedChars);

        //to print even character
        for(int i=0; i<name.length();i++){
            if(i%2==0){
                System.out.println(name.charAt(i));
            }
        }


    }
}