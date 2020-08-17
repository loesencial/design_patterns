package LibraryExample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReferenceBook implements IBook {
    private String libraryId;
    private String title;
    private String author;
    private int pages;

    public ReferenceBook(String libraryId, String title, String author, int pages) {
        this.libraryId = libraryId;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
