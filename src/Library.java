import java.util.Arrays;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        Book konyv = new Book("1984", 1949, "dráma", List.of(new Author("Orwell")));

        Book masikKonyv = new Book("Migránsok", 2018, "horror",
                List.of(new Author("Orwell"),new Author("Soros György")));

        System.out.println(konyv);
    }
}
