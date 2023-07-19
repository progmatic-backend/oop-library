import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LibraryManager {

    public static void main(String[] args) {
        Library konyvtar = new Library();

        Book konyv = new Book("1984", 1949, Genre.SCI_FI, List.of(new Author("George Orwell")));
        konyvtar.addBook(konyv);

        Reader olvaso = new Reader("Andris", "ASD420",
                new HashSet<>(Arrays.asList(Genre.HORROR, Genre.THRILLER)));

    }
}
