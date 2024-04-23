package com.Practical.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortExampleMain {
    public static void main(String[] args) {

        //Normal sort
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(50);
        marks.add(5);
//        System.out.println(marks);

        Collections.sort(marks);
//        System.out.println(marks);

        //****COMPARABLE***//
        // sort through Comparable, for this i have to create Employee class and implements Comparable
        //this Comparable will only works with single value like here i have compare only empId
        ArrayList<EmpComparable> marks1=new ArrayList<>();
        marks1.add(new EmpComparable("Vaibhav","6202913124",101));
        marks1.add(new EmpComparable("Aman","9502913124",100));
        marks1.add(new EmpComparable("Avi","5692913124",105));

        Collections.sort(marks1);
        System.out.println(marks1);

        //****COMPARATOR****//
        //Employee id wise sort
        //if we want to compare on specific fields then i have to create a class on that fields
        //first we need to create class of EmpIdComparator for compare id ,
        //if we want to compare name then create a class EmpNameComparator,
        //separate operation we have to perform.
        //Here i am comparing on the basis of emp id
        ArrayList<Employee> marks2=new ArrayList<>();
        marks2.add(new Employee("Aman","6202913124",101));
        marks2.add(new Employee("Vaibhav","9502913124",100));
        marks2.add(new Employee("Mohit","5692913124",105));

        Collections.sort(marks2,new EmpIdComparator());
//        System.out.println(marks2);

        //Employee Name wise sort
        //again i am comparing on the basis of employee name.
        //again i have to create a class for this
        ArrayList<Employee> marks3=new ArrayList<>(marks2);
        Collections.sort(marks3,new EmpNameComparator());
//        System.out.println(marks3);

    }
}
