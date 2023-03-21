package com.example.javacore.thread;

public class ThreadSample {
    public static void main(String[] args) {
        CustomerThread customerThread = new CustomerThread();
        customerThread.setName("1");
        CustomerThread customerThread2 = new CustomerThread();
        customerThread2.setName("2");
        customerThread.start();
        customerThread2.start();
    }
}

class CustomerThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count++ < 5) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.format("thread %s is running\n", this.getName());
        }

    }
}