package com.playalong.OOPsConcepts.NestedClasses.StaticNestedClass;

public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.innerMethod();

        OuterClass.InnerClass.staticInnerMethod();
    }
}
