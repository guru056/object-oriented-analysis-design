package com.playalong.OOPsConcepts.ExtendingPrivateMethods;

import java.util.LinkedList;
import java.util.List;

public abstract class BaseClass {
    protected int value;
    public BaseClass() {
        System.out.println("Super class Constructor called");
    }

    public int getValue() {
        return 0;
    }

    protected List<Integer> m1() {
        System.out.println("M1 from Base Class");
        return new LinkedList<>();
    }

    public static void staticMethod() {
        System.out.println("base class static method");
    }

    protected abstract List<Integer> m2();
}
