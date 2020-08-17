package org.example.Journal;

import java.io.FileNotFoundException;

public class JournalDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I caught a bug");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        persistence.saveToFile(journal, "journal.txt", true);
    }
}
