package org.example.abdul.streamApp;


import java.util.concurrent.Semaphore;

public class Foo {
    private Semaphore semaphore = new Semaphore(0);
    private Semaphore semaphoreTwo = new Semaphore(0);

    public void first(Runnable r) {
        System.out.print("first");
        semaphore.release();
    }
    public void second(Runnable r) {
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        System.out.print("second");
        semaphoreTwo.release();

    }
    public void third(Runnable r) {
            try {
               semaphoreTwo.acquire();
            } catch (InterruptedException e) {
                e.getMessage();
            }
           System.out.print("third");
        }
    }



