package org.example.Person;

public class PersonAccountGenerator {
    public static String createAccount(Person user) {
        String username = user.getFirstName().toLowerCase().substring(0, 1) + user.getLastName().toLowerCase();

        return username;
    }
}
