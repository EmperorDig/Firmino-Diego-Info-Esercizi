package EserciziClassi.Esercizio4;

public class Persona {
    private String nome, cognome;
    public Indirizzo indirizzo;
    public Azienda azienda;

    public Persona(String nome, String cognome, Indirizzo indirizzo, Azienda azienda) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.azienda = azienda;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome + "\tCognome: " + cognome + "\tIndirizzo: " + indirizzo + "\tAzienda: " + azienda);
    }
}
