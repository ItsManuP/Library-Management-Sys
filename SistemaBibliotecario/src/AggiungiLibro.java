import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class AggiungiLibro {
    
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci il titolo del libro: ");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci l'autore del libro: ");
        String autore = scanner.nextLine();

        System.out.println("Inserisci il genere del libro: ");
        String genere = scanner.nextLine();

        System.out.println("Inserisci l'editore del libro: ");
        String editore = scanner.nextLine();

        System.out.println("Inserisci l'anno di pubblicazione del libro: ");
        int annoPubblicazione = scanner.nextInt();

        System.out.println("Inserisci l'ISBN del libro: ");
        String isbn = scanner.nextLine();

        System.out.println("Inserisci la descrizione del libro: ");
        String descrizione = scanner.nextLine();

        System.out.println("Inserisci la disponibilità del libro: ");
        String disponibilità = scanner.nextLine();

        // Creo oggetto Libro
        Libro libro = new Libro(titolo, autore, genere, editore, annoPubblicazione, isbn, descrizione, disponibilità);

        // Prendo l'isbn come codice identificativo, suppongo ogni isbn sia univoco.
        String json = "{" +
        "\"titolo\":\"" + libro.getTitolo() + "\"," +
        "\"autore\":\"" + libro.getAutore() + "\"," +
        "\"genere\":\"" + libro.getGenere() + "\"," +
        "\"editore\":\"" + libro.getEditore() + "\"," +
        "\"annoPubblicazione\":" + libro.getAnnoPubblicazione() + "," +
        "\"isbn\":\"" + libro.getIsbn() + "\"," +
        "\"descrizione\":\"" + libro.getDescrizione() + "\"," +
        "\"disponibilita\":" + "\""+ libro.getDisponibilità() + "\""+
    "}";
    
    


     // Leggi contenuto del file (se esiste)
     String oldContent = "";
     try (FileReader fileReader = new FileReader("SistemaBibliotecario/src/dati/libri.json")) {
       int c;
       StringBuilder stringBuilder = new StringBuilder();
       while ((c = fileReader.read()) != -1) {
         stringBuilder.append((char) c);
       }
       oldContent = stringBuilder.toString();
     } catch (IOException e) {
       // File non esiste, crea un nuovo file vuoto(In caso TODO)
     }
 
     // Concateno i json
     String concatenatedJson;
     if (oldContent.isEmpty()) {
      concatenatedJson = "[" + json + "]";
  } else {
      concatenatedJson = oldContent.substring(0, oldContent.length() - 1) + "," + "\n" + json + "]";
  }



     // Scrivi contenuto concatenato sul file
     try (FileWriter fileWriter = new FileWriter("SistemaBibliotecario/src/dati/libri.json")) {
       fileWriter.write(concatenatedJson);
     } catch (IOException e) {
       e.printStackTrace();
     }
   }
 }


