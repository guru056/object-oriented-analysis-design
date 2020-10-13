package com.playalong.OOPsConcepts.ExtendingPrivateMethods;

public class Main {
    public static void main(String[] args) {
        BaseClass baseClass = new ChildClass(1);
        baseClass.m1();
        ChildClass.staticMethod();

//        Main obj = new Main();
//        System.out.println(obj.function(1));
    }

    private String function()
    {
        return ("GFG");
    }
    public final static String function(int data)
    {
        return ("GeeksforGeeks");
    }
}
