package LibraryExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Book implements IBook, IBorrowable {
    private String libraryId;
    private String title;
    private String author;
    private int pages;
    private int checkoutDurationInDays;
    private String borrower;
    private LocalDate borrowDate;

    public Book(String libraryId, String title, String author, int pages, int checkoutDurationInDays) {
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
        this.setBorrower(borrower);
        this.setBorrowDate(LocalDate.now());
    }

    @Override
    public LocalDate getDueDate() {
        return this.borrowDate.plusDays(this.checkoutDurationInDays);
    }
}
