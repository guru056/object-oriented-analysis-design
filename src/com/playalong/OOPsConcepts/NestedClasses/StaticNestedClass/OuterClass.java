package com.playalong.OOPsConcepts.NestedClasses.StaticNestedClass;

public class OuterClass {
    static int outerVar = 0;

    static class InnerClass {
        int innerVar;
        public InnerClass() {
            innerVar = outerVar;
        }

        public void innerMethod(){
            System.out.println("Inner class method");
        }

        public static void staticInnerMethod(){
            System.out.println("Static Inner class method");
        }
    }

}
