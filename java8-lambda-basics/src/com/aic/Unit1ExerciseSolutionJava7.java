package com.aic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charls", "Stevens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matt", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all people");
        printAll(people);

        // Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println("\nPrinting all people with last name beginning with C");
        printLastNameBeginningWithC(people);

        System.out.println("\nPrinting all people with last name beginning with C, conditionally");
        printConditionally(people, new PersonCondition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("\nPrinting all people with first name beginning with C, conditionally");
        printConditionally(people, new PersonCondition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

    }

    private static void printConditionally(List<Person> people, PersonCondition condition) {
        for (Person person : people) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }

    private static void printLastNameBeginningWithC(List<Person> people) {
        for (Person person : people) {
            if (person.getLastName().startsWith("C")) {
                System.out.println(person);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

interface PersonCondition {
    boolean test(Person p);
}
