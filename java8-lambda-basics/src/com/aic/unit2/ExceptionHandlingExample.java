package com.aic.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4 };
        int key  = 2;

        System.out.println("Add key to value");
        perform(numbers, key, (v, k) -> System.out.println(v + k));

        System.out.println("Divide value to key");
        perform(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

    }

    private static void perform(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int number: numbers) {
            consumer.accept(number, key);
        }
    }

    private static BiConsumer<Integer, Integer>  wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in wrapper lambda: " + e.getMessage());
            }

        };
    }

}
