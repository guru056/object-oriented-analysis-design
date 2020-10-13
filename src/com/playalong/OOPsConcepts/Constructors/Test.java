package com.playalong.OOPsConcepts.Constructors;

public class Test {

    int i;
    int j;
    public Test() {
        this(1);
    }

    public Test(int i) {
        this.i = i;
    }

    public Test(int i, int j) {
        this.i = i;
        this.j = j;
    }

    static public void testMethod(String  [] args) {
        System.out.println(args);
    }
    static public void testMethod(int arg,String... args) {
        System.out.println(args);
    }
    static public void testMethod(final String args) {
        System.out.println(args);
    }
}
