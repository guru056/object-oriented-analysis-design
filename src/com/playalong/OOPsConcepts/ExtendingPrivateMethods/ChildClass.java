package com.playalong.OOPsConcepts.ExtendingPrivateMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChildClass extends BaseClass {

    private int instanceVariable;

    public ChildClass(int instanceVariable) {
        this.instanceVariable = instanceVariable;
        System.out.println("Child class Constructor called");
    }

    @Override
    public int getValue() {
        return super.getValue();
    }

//    protected ArrayList<Integer> m1() {
//        System.out.println("M1 from Child Class");
//        return new ArrayList<>();
//    }

    @Override
    protected List<Integer> m2() {
        return null;
    }

    @Override
    protected List<Integer> m1() {
        return super.m1();
    }

    private Map<Integer,Integer> m1(boolean map) {
        return new HashMap<>();
    }

    public static void m3()
    {
        ChildClass childClass = new ChildClass(1);
        childClass.m1();
    }

    public  void m4(){
        this.m3();
    }
}
