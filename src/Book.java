import java.util.List;

public class Book {
    private final String title;
    private final int publicationYear;
    private final String genre; // enum
    private final List<Author> authors;

    public Book(String title, int publicationYear, String genre, List<Author> authors) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", genre='" + genre + '\'' +
                ", authors=" + authors +
                '}';
    }
}
