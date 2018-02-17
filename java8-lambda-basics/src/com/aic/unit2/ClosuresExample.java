package com.aic.unit2;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        doProcess(a, new MyProcess() {
//            @Override
//            public void process(int i) {
//                System.out.println(i + b);
//            }
//        });

        doProcess(a, (i) -> System.out.println(i + b));
    }

    public static void doProcess(int i, MyProcess p) {
        p.process(i);
    }

}

interface MyProcess {
    void process(int i);
}