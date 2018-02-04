package com.aic;

public class Greeter {

//    public void greet() {
//        System.out.println("Hello World!");
//    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
//        greeter.greet();

//        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
//        greeter.greet(helloWorldGreeting);
//        helloWorldGreeting.perform();

        Greeting myGreetingFunction = () -> System.out.println("Hello World! from lambda");
        myGreetingFunction.perform();
        greeter.greet(myGreetingFunction);


        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.println("Hello world! from inner class");
            }
        };
        innerClassGreeting.perform();
        greeter.greet(innerClassGreeting);
    }

}