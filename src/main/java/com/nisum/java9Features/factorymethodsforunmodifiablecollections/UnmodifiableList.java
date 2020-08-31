package com.nisum.java9Features.factorymethodsforunmodifiablecollections;


import java.util.List;
import java.util.logging.Logger;

public class UnmodifiableList {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static Employee e1,e2,e3,e5;
    public static void main(String[] args) {
        e1=new Employee(100,"sunny");
        e2=new Employee(101, "Bunny");
        e3=new Employee(102,"Chinny");

        List<Employee> emplist=List.of(e1,e2,e3);
        log.info("{}"+ emplist);
         e5=new Employee(103,"Laddu");

    }
}
