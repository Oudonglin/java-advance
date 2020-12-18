package com.doney.advanced.lambda;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 测试在lambda中使用外部变量
 */
public class lambdaTest {

    public static void main(String[] args) {
        AtomicReference<String> a = new AtomicReference<>("");
        new Thread(
                ()->{
                    while (true) {
                        a.set(UUID.randomUUID().toString());
                    }
                }
        ).start();
        new Thread(
                ()->{
                    while (true) {
                        System.out.println(a.get());
                    }
                }
        ).start();
        while (true) {
            a.set(UUID.randomUUID().toString());
            System.out.println(2);
        }

    }

}
