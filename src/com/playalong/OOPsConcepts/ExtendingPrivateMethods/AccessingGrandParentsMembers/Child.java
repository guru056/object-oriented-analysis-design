package com.playalong.OOPsConcepts.ExtendingPrivateMethods.AccessingGrandParentsMembers;

public class Child extends Parent {

    @Override
    public void func() {
        super.func();
        System.out.println("Child's function");
    }
}
