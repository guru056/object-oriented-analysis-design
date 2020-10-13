package com.playalong.OOPsConcepts.NestedClasses.InnerClasses;

public class OuterClass {
    int outerVar = 0;

    class InnerClass {
        int innerVar;
        public InnerClass() {
            innerVar = outerVar;
        }
        public void innerMethod(){
            System.out.println("Inner class method");
        }

    }
}
