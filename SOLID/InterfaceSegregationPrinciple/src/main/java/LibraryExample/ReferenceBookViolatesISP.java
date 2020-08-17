package LibraryExample;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ReferenceBookViolatesISP implements ILibraryItemViolatesISP {
    private String libraryId;
    private String title;
    private String author;
    private int pages;

    public ReferenceBookViolatesISP(String libraryId, String title, String author, int pages) {
        this.libraryId = libraryId;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void checkIn() {
        throw new RuntimeException("Cannot check out");
    }

    @Override
    public void checkOut(String borrower) {
        throw new RuntimeException("Cannot check out");
    }

    @Override
    public LocalDate getDueDate() {
        throw new RuntimeException("Cannot check out");
    }
}
