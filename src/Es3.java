import java.util.Arrays;
import java.util.Scanner;

public class Es3 {
    public static String[] nomiProdotti = {"Televisore", "Frigorifero", "Lavatrice", "Altro"};
    public static int[] nProdotti = new int[4];
    public static double[] prezzi = new double[4];
    public static double[] ricaviProdotti = new double[4];
    public static double ricavi;

    public static void leggiECalcola()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nomiProdotti.length; i++)
        {
            System.out.printf("Inserisci il numero di %s venduti: ", nomiProdotti[i]);
            nProdotti[i] = sc.nextInt();
            System.out.printf("Inserisci il prezzo per %s: ", nomiProdotti[i]);
            prezzi[i] = sc.nextDouble();
            ricaviProdotti[i] = prezzi[i] * nProdotti[i];
        }
    }
    public static void main(String[] args) {
        leggiECalcola();
        int totaleProdotti = Arrays.stream(nProdotti).sum();
        ricavi = Arrays.stream(ricaviProdotti).sum();

        // Stampa i risultati
        System.out.println("a) Ricavo totale delle vendite: " + ricavi);

        System.out.println("b) Numero di elettrodomestici venduti per ciascuna categoria:");
        for (int i = 0; i < nomiProdotti.length; i++) {
            System.out.printf("   - %s: %d (%.2f%%)\n", nomiProdotti[i], nProdotti[i], (nProdotti[i] / (double) totaleProdotti) * 100);
        }

        System.out.println("c) Ricavo per ciascuna categoria:");
        for (int i = 0; i < nomiProdotti.length; i++) {
            System.out.printf("   - %s: %.2f (%.2f%%)\n", nomiProdotti[i], ricaviProdotti[i], (ricaviProdotti[i] / ricavi) * 100);
        }
    }
}
