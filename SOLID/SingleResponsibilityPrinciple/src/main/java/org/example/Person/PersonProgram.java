package org.example.Person;

/**
 * A thinned down orchestrator with specific classes being called for specific functions
 * There is no golden rule on how far you need to decompose classes
 * It is whatever works for the particular domain
 */
public class PersonProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to my application");

        // get person information and build person object
        Person user = PersonDataCapture.capture();

        // check if person's names valid
        boolean isValid = PersonValidator.validate(user);
        if(isValid == false)
            System.exit(1);

        // create a username for the person
        String username = PersonAccountGenerator.createAccount(user);
        System.out.println("Your username is " + username);
    }
}
