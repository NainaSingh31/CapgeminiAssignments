package com.labs;

public class Main {
    public static void main(String[] args) {
        EmployeeService es=new EmployeeService();
        System.out.println(es.average());
        System.out.println(es.empWithMaxSal());
        System.out.println(es.totalSal());
        System.out.println(es.empNameAndSal());
        System.out.println(es.sortSalInDesc());
    }
}