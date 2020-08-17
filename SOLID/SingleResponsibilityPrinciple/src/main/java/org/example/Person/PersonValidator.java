package org.example.Person;

public class PersonValidator {
    public static boolean validate(Person user) {
        if(user.getFirstName().length() < 3) {
            System.out.println("You did not enter a valid first name");
            return false;
        }

        if(user.getLastName().length() < 2) {
            System.out.println("You did not enter a valid last name");
            return false;
        }

        return true;
    }
}
