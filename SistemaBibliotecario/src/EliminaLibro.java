import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class EliminaLibro {

    public static void main(String[] args) throws IOException {
        String filepath = "SistemaBibliotecario/src/dati/libri.json";

        // Load books from JSON
        List<Libro> libri = loadBooks(filepath);
        System.out.println(libri);
        for(Libro libro : libri) {
            System.out.println("Titolo del libro: " + libro.getTitolo());
        }

        // Get user input for book title to delete
        System.out.println("Inserisci il titolo del libro che vorresti eliminare: ");
        Scanner scanner = new Scanner(System.in);
        String titleToDelete = scanner.nextLine();
        scanner.close();

        // Find and delete book
        int index = findBookIndex(titleToDelete, libri);
        if (index != -1) {
            libri.remove(index);
            saveBooks(libri, filepath);
            System.out.println("Libro eliminato correttamente!");
        } else {
            System.out.println("Libro non trovato.");
        }
    }

    // Load books from JSON file
    private static List<Libro> loadBooks(String filepath) throws IOException {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Libro>>() {}.getType();
        try (FileReader reader = new FileReader(filepath)) {
            return gson.fromJson(reader, listType);
        }
    }

    // Find index of book with matching title
    private static int findBookIndex(String titleToDelete, List<Libro> libri) {
        for (int i = 0; i < libri.size(); i++) {
            if (libri.get(i).getTitolo().equals(titleToDelete)) {
                return i;
            }
        }
        return -1;
    }

    // Save list of books to JSON file
    private static void saveBooks(List<Libro> libri, String filepath) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(libri);
        try (FileWriter writer = new FileWriter(filepath)) {
            writer.write(json);
        }
    }
}