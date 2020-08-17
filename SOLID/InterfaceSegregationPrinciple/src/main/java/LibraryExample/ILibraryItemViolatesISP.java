package LibraryExample;

import java.time.LocalDate;

/**
 * The ILibraryItem interface is a monolith
 * It truly applies completely just to the Book class
 * AudioBook and ReferenceBook do not need to implement most of this interface
 * ISP dictates this in this case we break down the ILibraryItem into smaller interfaces
 */
public interface ILibraryItemViolatesISP {
    void checkIn();
    void checkOut(String borrower);
    LocalDate getDueDate();
}
