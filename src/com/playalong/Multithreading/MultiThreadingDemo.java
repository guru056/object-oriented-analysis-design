package com.playalong.Multithreading;

public class MultiThreadingDemo implements Runnable
{


    @Override
    public void run() {
        System.out.println( "Thread "  + Thread.currentThread().getId() + " is running");
    }
}
