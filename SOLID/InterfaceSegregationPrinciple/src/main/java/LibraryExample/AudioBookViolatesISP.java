package LibraryExample;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AudioBookViolatesISP implements ILibraryItemViolatesISP {

    private String libraryId;
    private String title;
    private String author;
    private int pages;
    private int checkoutDurationInDays;
    private String borrower;
    private LocalDate borrowDate;
    private int runtimeMinutes;

    @Override
    public void checkIn() {
        this.setBorrower("");
        this.setBorrowDate(null);
    }

    @Override
    public void checkOut(String borrower) {
        this.borrower = borrower;
        this.borrowDate = LocalDate.now();
    }

    @Override
    public LocalDate getDueDate() {
        return this.borrowDate.plusDays(this.checkoutDurationInDays);
    }
}
