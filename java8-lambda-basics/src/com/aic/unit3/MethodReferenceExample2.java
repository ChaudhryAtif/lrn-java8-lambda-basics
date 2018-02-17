package com.aic.unit3;

import com.aic.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charls", "Stevens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matt", "Arnold", 39)
        );

        System.out.println("Printing all people");
        performConditionally(people, p -> true, p -> System.out.println(p));
        System.out.println("");
        performConditionally(people, p -> true, System.out::println);

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : people) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
