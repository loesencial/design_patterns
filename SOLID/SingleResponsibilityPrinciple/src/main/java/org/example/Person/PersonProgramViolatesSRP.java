package org.example.Person;

import java.util.Scanner;

/**
 * This class is doing too many things, violating the SRP principle
 * 1) It prints welcome message
 * 2) It captures the person's names and builds Person object
 * 3) It checks if the Person object is valid
 * 4) It creates the user name/account
 */

public class PersonProgramViolatesSRP {
    public static void main(String[] args) {
        System.out.println("Welcome to my application");

        Scanner scanner = new Scanner(System.in);

        // get person information and build person object
        System.out.println("What is your first name? ");
        String firstName = scanner.next();
        System.out.println("What is your last name? ");
        String lastName = scanner.next();
        Person user = new Person(firstName, lastName);

        // check if person's names valid
        if(user.getFirstName().length() < 3) {
            System.out.println("You did not enter a valid first name");
            System.exit(1);
        }

        if(user.getLastName().length() < 3) {
            System.out.println("You did not enter a valid last name");
            System.exit(1);
        }

        // create a username for the person
        String username = user.getFirstName().toLowerCase().substring(0, 1) + user.getLastName().toLowerCase();
        System.out.println("Your username is " + username);
    }
}
