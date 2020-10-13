package com.playalong.OOPsConcepts.NestedClasses.InnerClasses.LocalInnerClasses;

public class OuterClass {
    int outerVar = 0;

    public void outerMethod() {
        int localVar = 50;
        class InnerClass {
            int localSum = localVar;
            int var = outerVar; // can access member variables of outer class
            public void innerClassMethod() {
                int localSum = localVar;
                System.out.println("Inner class method inside an inner class in a method");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.innerClassMethod();
    }
}
