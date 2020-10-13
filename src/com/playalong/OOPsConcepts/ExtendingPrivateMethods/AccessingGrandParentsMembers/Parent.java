package com.playalong.OOPsConcepts.ExtendingPrivateMethods.AccessingGrandParentsMembers;

public class Parent extends Grandparent {

    public void func() {
        super.func();
        System.out.println("Parent's function");
    }
    public void foo() {}
}
