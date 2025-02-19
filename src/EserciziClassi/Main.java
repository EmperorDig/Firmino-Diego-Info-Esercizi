package EserciziClassi;

public class Main {
    public static void main(String[] args) {
        Auto miaAuto = new Auto("Fiat", "Panda", 2020, "Rosso");
        miaAuto.mostraInfo();
        miaAuto.cambiaColore("Blu");
        miaAuto.mostraInfo();


        ContoBancario conto = new ContoBancario("12345", 1000, "Mario Rossi");
        System.out.println("Saldo iniziale: " + conto.getSaldo());
        conto.deposita(500);
        conto.preleva(200);
        conto.preleva(2000); // Dovrebbe fallire
        System.out.println("Saldo finale: " + conto.getSaldo());


        Prodotto p = new Prodotto("Laptop", 1200.50, 10);
        System.out.println("scorte = " + p.getQuantita());
        p.acquista(3);
        p.rifornisci(5);
        p.acquista(13); // Dovrebbe fallire
        System.out.println("scorte = " + p.getQuantita());
    }
}
