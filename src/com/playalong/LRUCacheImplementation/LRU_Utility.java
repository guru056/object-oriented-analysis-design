package com.playalong.LRUCacheImplementation;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LRU_Utility {

    public static void main(String[] args)
    {
        LRU<Integer,Integer> lru = new LRU();
        lru.set(1,34);
        lru.set(2,35);
        lru.set(5,36);
        lru.set(3,37); //deletes 1 from cache

        System.out.println(lru.get(1));
        System.out.println(lru.get(2));
        System.out.println(lru.get(1));
        System.out.println(lru.get(2));
        System.out.println(lru.get(5));
        System.out.println(lru.get(3));

        lru.set(10,111); // deletes 2 from cache
        lru.get(10);

    }
}
