package EserciziClassi.Esercizio4;

public class Indirizzo {
    private String via, citta, cap;

    public Indirizzo(String via, String citta, String cap) {
        this.via = via;
        this.citta = citta;
        this.cap = cap;
    }

    public String getVia() {
        return via;
    }

    public String getCitta() {
        return citta;
    }

    public String getCap() {
        return cap;
    }

    public void getDettagli() {
        System.out.println("Indirizzo: " + via + ", " + citta + ", " + cap);
    }

    @Override
    public String toString() {
        return "Indirizzo{" +
                "via='" + via + '\'' +
                ", citta='" + citta + '\'' +
                ", cap='" + cap + '\'' +
                '}';
    }
}
