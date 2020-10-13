package com.playalong.OOPsConcepts.MethodOverLoading;

public class Test {

    public void func(Integer i) {
        System.out.println("func(Integer)");
    }
    public void func(String i) {
        System.out.println("func(String)");
    }


    public void funcPrimitive(int i) {
        System.out.println("func(Integer)");
    }

    public void funcA(int a) {}
    public void funcA(int... a) {}

    public void funcB(int a) {}
    public void funcB(boolean a) {}

    static void fun(float... x)
    {
        System.out.println("float varargs");
    }

    //varargs method with int datatype
    static void fun(int... x)
    {
        System.out.println("int varargs");
    }

    //varargs method with double datatype
    static void fun(double... x)
    {
        System.out.println("double varargs");
    }

    static void fun(boolean... x)
    {
        System.out.println("double varargs");
    }
//    public void funcPrimitive(float i) {
//        System.out.println("func(Integer)");
//    }
}
