package com.aic.unit3;

import com.aic.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charls", "Stevens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matt", "Arnold", 39)
        );

//        people.stream()
//                .forEach(p -> System.out.println(p.getFirstName()));

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

    }

}
