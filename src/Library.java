import java.util.ArrayList;

import java.util.List;
import java.util.Map;

public class Library {

    // TODO
    // private Map<Book, Integer> bookAmount;

    private final List<Book> books;
    private final List<Reader> readers;

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addReader(Reader reader) {
        this.readers.add(reader);
    }


    public List<Book> findBookByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBookByGenre(Genre genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            for (Author author: book.getAuthors()) {
                if (author.getName().contains(authorName)) {
                    result.add(book);
                    break; // lehet, hogy több szerzője van, amire igaz a keresési feltétel -> csak 1x kerüljön bele
                }
            }
        }
        return result;
    }


}
