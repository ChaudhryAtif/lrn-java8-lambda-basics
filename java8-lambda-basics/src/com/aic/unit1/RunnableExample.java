package com.aic.unit1;

public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        myThread.run();

        Thread lambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        lambdaThread.run();
    }

}
