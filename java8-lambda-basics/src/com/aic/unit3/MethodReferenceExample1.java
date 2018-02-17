package com.aic.unit3;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
//        printMessage();

        Thread thread = new Thread(() -> printMessage());
        thread.start();

        Thread thread2 = new Thread(MethodReferenceExample1::printMessage);
        thread2.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }

}
