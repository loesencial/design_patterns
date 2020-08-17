package org.example.Journal;

import java.io.FileNotFoundException;

public class JournalViolatesSRPDemo {
    public static void main(String[] args) throws FileNotFoundException {
        JournalViolatesSRP journal = new JournalViolatesSRP();
        journal.addEntry("I cried today");
        journal.addEntry("I caught a bug");
        System.out.println(journal);

        journal.save("journalSavedViolatingSRP.txt");
    }
}
