package LibraryExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class BookViolatesISP implements ILibraryItemViolatesISP {

    private String libraryId;
    private String title;
    private String author;
    private int pages;
    private int checkoutDurationInDays;
    private String borrower;
    private LocalDate borrowDate;

    public BookViolatesISP(String libraryId, String title, String author, int pages, int checkoutDurationInDays) {
        this.libraryId = libraryId;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.checkoutDurationInDays = checkoutDurationInDays;
    }

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
