package Consegna1;
import java.util.Random;

/*Scrivere un frammento di codice che verifichi che la variabile intera punteggio
contenga un valore valido. Si supponga che i valori siano validi se sono compresi tra
0 e 100*/

public class Esercizio3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int punteggio = random.nextInt(-50,150);
        System.out.println("punteggio: " + punteggio);
        if (punteggio <= 100 && punteggio >= 0)
        {
            System.out.println("punteggio valido");
        }
        else
        {
            System.out.println("punteggio non valido");
        }
    }
}
