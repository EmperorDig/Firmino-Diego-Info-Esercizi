package EserciziClassi;

public class Auto {
    private String marca;
    private String modello;
    private int anno;
    public String colore;

    public Auto(String marca, String modello, int anno, String colore) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void mostraInfo() {
        System.out.println("Marca: " + marca + "\tModello: " + modello + "\tAnno: " + anno + "\tColore: " + colore);
    }
    public void cambiaColore(String colore) {
        this.colore = colore;
    }
}