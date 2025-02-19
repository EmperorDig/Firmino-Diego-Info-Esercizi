package EserciziClassi.Esercizio4;

public class RelazioneTest {
    public static void main(String[] args) {
        // Creazione di un indirizzo
        Indirizzo indirizzo1 = new Indirizzo("Via Roma 10", "Torino", "10100");


        // Creazione di un'azienda
        Azienda azienda1 = new Azienda("Tech Corp", "Informatica");


        // Creazione di una persona che vive all'indirizzo e lavora nell'azienda
        Persona persona1 = new Persona("Luca", "Bianchi", indirizzo1, azienda1);


        // Stampa delle informazioni
        persona1.mostraInfo();
    }
}

