import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LibraryManager {
    public static void main(String[] args) {
        Library konyvtar = new Library();
        initialize(konyvtar);

        System.out.println(konyvtar.findBookByTitle("1984"));
        System.out.println(konyvtar.findBooksByAuthor("Soros"));
        System.out.println(konyvtar.findBookByGenre(Genre.SCI_FI));
    }

    private static void initialize(Library konyvtar) {
        Book konyv = new Book("1984", 1949, Genre.SCI_FI, List.of(new Author("George Orwell")));
        Book konyv2 = new Book("Migránsok", 2018, Genre.HORROR,
                List.of(new Author("George Orwell"), new Author("Soros György")));
        Book konyv3 = new Book("Ez veszélyes", 2018, Genre.SCI_FI,
                List.of(new Author("Soros György"), new Author("Soros Bérenc")));
        konyvtar.addBook(konyv);
        konyvtar.addBook(konyv2);
        konyvtar.addBook(konyv3);

        Reader olvaso = new Reader("Andris", "ASD420",
                new HashSet<>(Arrays.asList(Genre.HORROR, Genre.THRILLER)));
        konyvtar.addReader(olvaso);
    }
}
