package EserciziClassi.Esercizio4;

public class Azienda {
    private String nome, settore;

    public Azienda(String nome, String settore) {
        this.nome = nome;
        this.settore = settore;
    }

    public String getNome() {
        return nome;
    }

    public String getSettore() {
        return settore;
    }

    public void getInfo() {
        System.out.println("Nome: " + nome + "\tSettore: " + settore);
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "nome='" + nome + '\'' +
                ", settore='" + settore + '\'' +
                '}';
    }
}
