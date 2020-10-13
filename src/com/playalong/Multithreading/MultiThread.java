package com.playalong.Multithreading;

public class MultiThread {

    public static void main(String[] args) {
        int n = 8;
        for (int i =0 ;i < n; i++) {
            Thread thread = new Thread(new MultiThreadingDemo());
            thread.start();
        }
    }
}
