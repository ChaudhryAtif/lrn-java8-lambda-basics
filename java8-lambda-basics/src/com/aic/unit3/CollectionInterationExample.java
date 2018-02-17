package com.aic.unit3;

import com.aic.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionInterationExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charls", "Stevens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matt", "Arnold", 39)
        );

        System.out.println("Using for loop");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

        System.out.println("Using for-each/for-in loop");
        for (Person p : people) {
            System.out.println(p);
        }

        System.out.println("Using lamda for-each, method reference");
        people.forEach(p -> System.out.println(p));
        System.out.println();
        people.forEach(System.out::println);
    }

}
