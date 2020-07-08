package com.playalong.HashmapImplementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashMapUtility {

    public static void main(String[] args) {

        /******** <String, Integer> Map ********/
        HashMap<String,Integer> mapStringInteger = new HashMap();
        mapStringInteger.put("one",1);
        mapStringInteger.put("one",11);
        mapStringInteger.put("two",2);
        mapStringInteger.put("three",3);
        mapStringInteger.remove("three");
        System.out.println(mapStringInteger);
        System.out.println(mapStringInteger.size());

        /******** <Integer, Integer> Map ********/
        HashMap<Integer,Integer> mapIntegers = new HashMap<>();
        mapIntegers.put(1, 11);
        mapIntegers.put(2, 22);
        System.out.println(mapIntegers);
        System.out.println(mapIntegers.size());

        /******** <Integer, List<Integer>> Map ********/
        HashMap<Integer, List<Integer>> mapIntegerList = new HashMap<>();
        mapIntegerList.put(1, new ArrayList<Integer>(Arrays.asList(1,2)));
        mapIntegerList.put(2, new ArrayList<Integer>(Arrays.asList(2,3)));
        System.out.println(mapIntegerList);
        System.out.println(mapIntegerList.size());

        /******** < List<Integer>, Integer> Map ********/
        HashMap<List<Integer>, Integer> mapListInteger = new HashMap<>();
        mapListInteger.put(new ArrayList<>(Arrays.asList(1,2)), 1);
        mapListInteger.put(new ArrayList<>(Arrays.asList(1,2)), 2);
        System.out.println(mapListInteger);
        System.out.println(mapListInteger.size());
    }
}
