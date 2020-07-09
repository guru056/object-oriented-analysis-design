package com.playalong.ExpiryMap;

public class ExpiryMapUtility {

    public static void main(String[] args) {
        ExpiryMap<Integer, Integer> expiryMap = new ExpiryMap<>(10);
        expiryMap.put(1,1);

        //run for 1 minute at an interval of 2 secs
        long initialMillis = System.currentTimeMillis();
        long currentMillis = System.currentTimeMillis();

        while (currentMillis - initialMillis < 60*1000) {
            System.out.println("Map contents: ");
            System.out.println(expiryMap);
            System.out.println("Map size: ");
            System.out.println(expiryMap.size());

            currentMillis = System.currentTimeMillis();
            System.out.println("sleeping for 2 secs");
            try {
                Thread.sleep(2*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
