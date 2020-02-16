package com.pattern.strategy;

import java.util.*;

public class Example {

    private static void printContents(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public static void main(String args[]) {
        Person bryan = new Person("Bryan", "124", 39);
        Person mark = new Person("Mark", "124", 20);
        Person chris = new Person("Chris", "124", 44);

        List<Person> people = new ArrayList<Person>();
        people.add(bryan);
        people.add(mark);
        people.add(chris);

        System.out.println("Not sorted");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) return 1;
                if (o1.getAge() < o2.getAge()) return -1;
                return 0;
            }
        });
        System.out.println("\n");
        printContents(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\n");
        printContents(people);
        System.out.println("\n");
    }
}
