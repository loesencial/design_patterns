package org.example.Journal;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> entries;
    private static int count = 0;

    public Journal() {
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
}
