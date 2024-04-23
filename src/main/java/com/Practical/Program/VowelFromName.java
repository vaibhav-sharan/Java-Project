package com.Practical.Program;

import java.util.ArrayList;
import java.util.Objects;

public class VowelFromName {
    public static void main(String[] args) {
        char a[] = {'v','a','i','b','h','a','v'};
        char b[] = {'a','e','i','o','u'};
        ArrayList<Object> vowels=new ArrayList<>();
        ArrayList<Object> notVowels=new ArrayList<>();
        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    vowels.add(a[i]);
                }else{
                    notVowels.add(a[i]);
                }

//                System.out.println(b[j]);
            }

        }
        System.out.println("Vowels" +vowels);
    }
}