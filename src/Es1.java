import java.util.Scanner;

public class Es1 {

    public static void stampaSegni(int numero) {
        System.out.print(numero + ": ");
        if (numero % 2 == 0) {
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
        } else {
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci un numero intero non negativo (0 per terminare): ");
            int numero = scanner.nextInt();
            if (numero < 0)
            {
                continue;
            }
            if (numero == 0) {
                break;
            }

            stampaSegni(numero);
        }
    }
}
