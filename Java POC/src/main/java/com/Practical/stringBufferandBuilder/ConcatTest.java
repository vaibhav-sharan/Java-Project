package com.Practical.stringBufferandBuilder;

public class ConcatTest{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Java");
        sb.append("Tpoint");
        System.out.println(sb);
//        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
//        startTime = System.currentTimeMillis();
//        StringBuilder sb2 = new StringBuilder("Java");
//        for (int i=0; i<10000; i++){
//            sb2.append("Tpoint");
//        }
//        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}