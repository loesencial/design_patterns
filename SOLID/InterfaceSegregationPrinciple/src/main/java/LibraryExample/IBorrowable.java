package LibraryExample;

import java.time.LocalDate;

public interface IBorrowable {
    void checkIn();
    void checkOut(String borrower);
    LocalDate getDueDate();
}
