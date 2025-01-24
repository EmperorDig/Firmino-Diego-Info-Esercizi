package Consegna1;
import java.util.Scanner;

/* Scrivere un programma che chieda all'utente di restituire una riposta di tipo si/no.
   Si supponga che il programma legga la risposta dell'utente e la inserisca nella variabile
   String risposta.
   Se il valore di risposta è si o s, assegnare alla variabile accettato il valore
   true; altrimenti assegnare false.
   Come si può modificare il codice in modo che accetti anche i valori Si e S? */

public class Esercizio3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una risposta (si/s o no):");
        String risposta = scanner.nextLine();
        risposta = risposta.toLowerCase();
        boolean accettato = risposta.equals("si") || risposta.equals("s");
        System.out.println("accettato: " + accettato);
        scanner.close();
    }
}
