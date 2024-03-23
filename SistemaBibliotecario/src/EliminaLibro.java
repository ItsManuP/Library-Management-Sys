import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class EliminaLibro {
    
    public static void main(String[] args){
    try{
        String filepath = "SistemaBibliotecario/src/dati/libri.json";
        Gson gson = new Gson();
        FileReader fileReader = new FileReader(filepath);
        Libro[] libri = gson.fromJson(fileReader, Libro[].class);
        for(Libro libro: libri){
            System.out.println("Titolo: "+ libro.getTitolo());
        }
    } catch (IOException e) {
        e.printStackTrace();
      }



    

    }
}
