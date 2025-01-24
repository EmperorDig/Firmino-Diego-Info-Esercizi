package Consegna1;
import java.util.Random;

/*Scrivere un frammento di codice che cambia il valore intero memorizzato nella variabile
x nel seguente modo: se x è pari, deve essere diviso per 2; se è dispari deve essere
moltiplicato per 3 e gli deve esser sottratto 1.*/

public class Esercizio3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(-100,100);
        System.out.println("x: " + x);
        if (x % 2 == 0) {
            x = x / 2;
        } else {
            x = x * 3 - 1;
        }

        System.out.println("Il nuovo valore di x è: " + x);
    }
}
