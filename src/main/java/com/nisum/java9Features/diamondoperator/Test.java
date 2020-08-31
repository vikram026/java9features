package com.nisum.java9Features.diamondoperator;

public class Test {
    public static void main(String[] args) {
        MyGenClass<String> c1 = new MyGenClass<String>("Durga") {
            public void process() {
                System.out.println("Processing... " + getObj());
            }
        };
        c1.process();

        MyGenClass<String> c2 = new MyGenClass<>("Pavan") {
            public void process() {
                System.out.println("Processing... " + getObj());
            }
        };
        c2.process();
    }

}
