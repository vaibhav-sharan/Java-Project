package com.Practical.ComparatorVsComparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpComparable implements Comparable<EmpComparable>{

    private String name;
    private String phone;
    private int empId;

    @Override
    public int compareTo(EmpComparable o) {

        return this.empId-o.empId;
    }
}
