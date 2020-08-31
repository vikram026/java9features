package com.nisum.java9Features.factorymethodsforunmodifiablecollections;

public class Employee {
    private int eno;
    private String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return String.format("%d=%s",eno,ename);
    }
}
