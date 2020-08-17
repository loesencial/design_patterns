package LibraryExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class AudioBook implements IAudioBook, IBorrowable {
    private String libraryId;
    private String title;
    private String author;
    private int runtimeMinutes;
    private int checkoutDurationInDays;
    private String borrower;
    private LocalDate borrowDate;

    @Override
    public void checkIn() {
        this.borrower = null;
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
