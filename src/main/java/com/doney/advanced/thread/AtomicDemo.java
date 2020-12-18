package com.doney.advanced.thread;

import java.util.concurrent.atomic.AtomicInteger;


public class AtomicDemo {

    public static AtomicInteger atomicInteger = new AtomicInteger();


    public static void main(String[] args) {
        atomicInteger.set(1);
        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);

    }
}
