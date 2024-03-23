
public class Libro {

    private String titolo;
    private String autore;
    private String genere;
    private String editore;
    private int annoPubblicazione;
    private String isbn;
    private String descrizione;
    private String disponibilità;
    
    public Libro(String titolo, String autore, String genere, String editore, int annoPubblicazione, String isbn, String descrizione, String disponibilità) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.editore = editore;
        this.annoPubblicazione = annoPubblicazione;
        this.isbn = isbn;
        this.descrizione = descrizione; 
        this.disponibilità = disponibilità;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    } 

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDisponibilità() {
        return disponibilità;
    }
    
    public void setDisponibilita(String disponibilità) {
        this.disponibilità = disponibilità;
    }

    public String getInformazioniLibro(){
        return
        "Titolo: " + titolo + "\n"
        + "\nAutore: " + autore + "\n"
        + "\nGenere: " + genere + "\n"
        + "\nEditore: " + editore + "\n"
        + "\nAnno di pubblicazione: " + annoPubblicazione + "\n"
        + "\nISBN: " + isbn + "\n"
        + "\nDescrizione: " + descrizione + "\n"
        + "\nDisponibilità: " + disponibilità ;
        
    }

}