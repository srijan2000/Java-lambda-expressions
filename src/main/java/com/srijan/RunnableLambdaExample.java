package com.srijan;

 class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("run method");
    }
}

public class RunnableLambdaExample{
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = () -> System.out.println("run method is called using lambda ... ");
        Thread thread1 = new Thread(runnable);
        thread1.start();

    }
}
