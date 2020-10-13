package com.playalong.OOPsConcepts.MethodOverLoading;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        test.func((Integer) null);
        test.funcA();
        test.fun(1);
    }
}
