package EserciziClassi;

public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    public Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo > 0 ? prezzo : this.prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void acquista(int pezzi) {
        this.quantita -= this.quantita - pezzi >= 0 ? pezzi : 0;
    }

    public void rifornisci(int pezzi) {
        this.quantita += Math.max(pezzi, 0);
    }
}
