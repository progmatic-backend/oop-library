import java.util.*;

public class Library {


    private final Map<Book, Integer> bookCopies; // könyv --> db

    private final List<Reader> readers;

    public Set<Book> getBooks() {
        return bookCopies.keySet();
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public Library() {
        this.readers = new ArrayList<>();
        this.bookCopies = new HashMap<>();
    }

    public void addBook(Book book) {
        this.bookCopies.put(book, bookCopies.getOrDefault(book, 0) + 1);
    }

    public void addBook(Book book, int amount) {
        this.bookCopies.put(book, bookCopies.getOrDefault(book, 0) + amount);
    }

    public void addReader(Reader reader) {
        this.readers.add(reader);
    }


    public List<Book> findBookByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookCopies.keySet()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBookByGenre(Genre genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookCopies.keySet()) {
            if (book.getGenre() == genre) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookCopies.keySet()) {
            for (Author author : book.getAuthors()) {
                if (author.getName().contains(authorName)) {
                    result.add(book);
                    break; // lehet, hogy több szerzője van, amire igaz a keresési feltétel -> csak 1x kerüljön bele
                }
            }
        }
        return result;
    }


}
