package com.playalong.OOPsConcepts.Interfaces;

import java.util.Comparator;

public interface intFA {
    int a = 0;
    void func();

    private void funcPrivate() {

    }

    static void staticMethod()
    {
        System.out.println("interface A static method");
    }
}

class Cmp implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
