import java.util.ArrayList;

import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    // TODO
    public List<Book> findBookByTitle(String title) {
        return null;
    }


}
