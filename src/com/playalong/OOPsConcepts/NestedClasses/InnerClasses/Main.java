package com.playalong.OOPsConcepts.NestedClasses.InnerClasses;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerMethod();
    }
}
