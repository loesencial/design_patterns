package org.example.Person;

import java.util.Scanner;

public class PersonDataCapture {
    public static Person capture() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstName = scanner.next();

        System.out.println("What is your last name? ");
        String lastName = scanner.next();

        return new Person(firstName, lastName);
    }
}
