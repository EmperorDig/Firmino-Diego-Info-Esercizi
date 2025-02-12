import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secondi = -1;
        while (secondi < 0 || secondi > 84600)
        {
            System.out.print("Inserisci una misura di tempo in secondi (tra 0 e 84600): ");
            secondi = sc.nextInt();

            if (secondi < 0 || secondi > 84600)
            {
                System.out.println("Valore non valido.");
            }
        }
        convertiEStampa(secondi);
    }

    public static void convertiEStampa(int secondi) {
        int ore = secondi / 3600;
        int minuti = (secondi % 3600) / 60;
        int secondiRimanenti = secondi % 60;

        System.out.printf("%d s corrispondono a %d h, %d m e %d s\n", secondi, ore, minuti, secondiRimanenti);
    }
}
