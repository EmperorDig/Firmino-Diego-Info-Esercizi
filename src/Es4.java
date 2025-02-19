import java.util.Random;
import java.util.Scanner;


public class Es4 {

    public static String squadra1, squadra2;
    public static int goalSquadraA, goalSquadraB;
    public static Modalita modalita;
    public static boolean squadra; //quando negativo prima squadra sennò seconda

    public enum Modalita
    {
        sim,
        single,
        multi,
    }

    public enum Direzione
    {
        a,
        s,
        d,
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il nome della squadra 1: ");
        squadra1 = sc.nextLine();
        System.out.println("Inserisci il nome della squadra 2: ");
        squadra2 = sc.nextLine();
        System.out.println("Scegli la modalita sim/single/multi: ");
        modalita = Modalita.valueOf(sc.nextLine().toLowerCase());
        do {
            squadra = false;
            int nTiri = 5;
            goalSquadraA = 0;
            goalSquadraB = 0;
            int tiriTotali = 0;
            System.out.println("Inizio spareggio ai rigori!");
            for (int i = 0; i < nTiri; i++) {
                if (squadra) {
                    goalSquadraB += tiraRigore();
                }
                else {
                    goalSquadraA += tiraRigore();
                }
                squadra = !squadra;
                if (squadra) {
                    goalSquadraB += tiraRigore();
                }
                else {
                    goalSquadraA += tiraRigore();
                }
                squadra = !squadra;
                if (i == nTiri - 1 && goalSquadraA == goalSquadraB) {
                    nTiri++;
                }
                else if (i == nTiri - 1) {
                    if (goalSquadraA > goalSquadraB) {
                        System.out.printf("Ha vinto %s, gol: %d%n", squadra1, goalSquadraA);
                    }
                    else {
                        System.out.printf("Ha vinto %s, gol: %d%n", squadra2, goalSquadraB);
                    }
                }
            }
            System.out.println("Vuoi la rivincita? y/n (default n)");
        } while (sc.nextLine().equalsIgnoreCase("y"));
    }

    // Metodo per simulare un tiro di rigore
    public static int tiraRigore() {
        switch (modalita) {
            case sim: {
                Direzione direzioneAtt = getRandomDirezione();
                Direzione direzioneDif = getRandomDirezione();
                if (direzioneAtt.equals(direzioneDif)) {
                    System.out.println("PARATA");
                    return 0;
                }
                System.out.println("GOL");
                return 1;
            }
            case single: {
                Direzione direzioneAtt;
                Direzione direzioneDif;
                if (squadra) {
                    direzioneAtt = getRandomDirezione();
                    direzioneDif = getDirezione();
                }
                else {
                    direzioneAtt = getDirezione();
                    direzioneDif = getRandomDirezione();
                }
                if (direzioneAtt.equals(direzioneDif)) {
                    System.out.println("PARATA");
                    return 0;
                }
                System.out.println("GOL");
                return 1;
            }
            case multi: {
                Direzione direzioneAtt = getDirezione();
                Direzione direzioneDif = getDirezione();
                if (direzioneAtt.equals(direzioneDif)) {
                    System.out.println("PARATA");
                    return 0;
                }
                System.out.println("GOL");
                return 1;
            }
        }
        return 0;
    }

    public static Direzione getRandomDirezione() {
        Random r = new Random();
        Direzione[] direzioni = Direzione.values();
        int indiceCasuale = r.nextInt(direzioni.length);
        return direzioni[indiceCasuale];
    }

    public static Direzione getDirezione() {
        Scanner sc = new Scanner(System.in);
        Direzione direzione = null;
        boolean valida = false;
        System.out.println("scegli la direzione a(sinistra)/s(centro)/d(destra): ");
        while (!valida) {
            System.out.print("\u001B[8m"); // Nascondi il testo (ANSI)
            try {
                direzione = Direzione.valueOf(sc.nextLine().toLowerCase());
                valida = true;
            } catch (IllegalArgumentException e) {
                System.out.println("\u001B[0mScelta non valida. Riprova a(sinistra)/s(centro)/d(destra):");
            }
        }

        System.out.print("\u001B[0m");
        return direzione;
    }
}
