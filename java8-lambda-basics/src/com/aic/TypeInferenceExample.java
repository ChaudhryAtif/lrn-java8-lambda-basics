package com.aic;

public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));

        StringLengthLambda myLambda1 = (s) -> s.length();
        System.out.println(myLambda1.getLength("Hello Lambda"));

        StringLengthLambda myLambda2 = s -> s.length();
        System.out.println(myLambda2.getLength("Hello Lambda"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda stringLengthLambda) {
        System.out.println(stringLengthLambda.getLength("Hello Lambda!"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }

}
