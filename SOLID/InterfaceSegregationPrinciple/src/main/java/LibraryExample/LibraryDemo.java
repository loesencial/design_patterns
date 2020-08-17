package LibraryExample;

public class LibraryDemo {
    public static void main(String[] args) {
        //When violating ISP
        System.out.println("Violating ISP");
        ILibraryItemViolatesISP b1 = new BookViolatesISP("123-1", "Learning Java", "John Doe", 111,
                14);
        b1.checkOut("Jane Doe");
        System.out.println(b1);

        ILibraryItemViolatesISP r1 = new ReferenceBookViolatesISP("123-2", "Java Bible", "Henry Doe", 999);
        r1.checkOut("Jane Doe"); // this causes an exception to be thrown because checking out a ReferenceBook is not allowed

        //When following ISP
        System.out.println("Following ISP");
        ILibraryItem b2 = new Book("123-3", "Learning Java", "John Doe", 111, 14);
        b1.checkOut("Jane Doe");
        System.out.println(b2);

        ILibraryItem r2 = new ReferenceBook("123-4", "Java Bible", "Henry Doe", 999);
        //r2.checkOut() //this is not allowed at all in the first place because ReferenceBook does not implement the IBorrowable interface
    }
}
