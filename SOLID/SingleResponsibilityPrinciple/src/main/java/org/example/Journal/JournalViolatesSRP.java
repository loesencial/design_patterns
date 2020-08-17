package org.example.Journal;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class JournalViolatesSRP {
    private List<String> entries;
    private static int count = 0;

    public JournalViolatesSRP() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    //########################################################//
    // When you try to save/load the Journal into/from persistence, it starts violating the SRP principle
    // Adding this here, would mean that you would have to change this class if the Journal changes in some way,
    // or the Persistence changes

    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(this.toString());
        }
    }

    public void load(String filename) {}

    public void load(URL url) {}

}
