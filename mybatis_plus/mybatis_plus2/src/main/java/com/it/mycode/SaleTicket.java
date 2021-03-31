package com.it.mycode;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SaleTicket {

    private static int ticket = 10;
    private static String str = "11";

    public static void main(String[] args) {


        new Thread(new SaleDemoA(), "售票员1").start();
        new Thread(new SaleDemoB(), "售票员2").start();
        new Thread(new SaleDemoC(), "售票员3").start();
    }

    public static class SaleDemoA implements Runnable {


        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (str) {
                    if (ticket > 0) {

                        if (ticket % 3 == 1) {
                            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");

                            ticket--;
                        }

                    } else break;
                }

            }
        }
    }

    public static class SaleDemoB implements Runnable {


        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (str) {
                    if (ticket > 0) {


                        if (ticket % 3 == 0) {
                            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");

                            ticket--;
                        }
                    } else break;
                }

            }
        }
    }

    public static class SaleDemoC implements Runnable {


        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (str) {
                    if (ticket > 0) {


                        if (ticket % 3 == 2) {
                            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");

                            ticket--;
                        }
                    } else break;
                }

            }
        }
    }
}
