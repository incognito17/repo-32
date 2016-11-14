package tpe.exceptions.trycatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public final class Smts {

    /**
     * Liest einen String von der Tastatur.
     *
     * @return der gelesene String
     * @throws IOException Probleme mit der Console
     * @throws NumberFormatException
     */
    private static String readNumber()
            throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String input = br.readLine();
        return input;

    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     * @throws NumberFormatException Fehler bei der Zahlenkovertierung
     * @throws IOException I/O-Fehler
     */
    public static void main(String[] args) {

        // zu ratende Zahl bestimmen

        int zahl = new Random().nextInt(100) + 1;

        int versuche = 0;

        while (true) {

            System.out.print("Bitte geben Sie eine Zahl ein: ");
            int geraten = 0;
            try {
                geraten = Integer.parseInt(readNumber());
            }
            catch (NumberFormatException | IOException t) {
                System.err.println("HET");
                continue;
            }
            versuche++;

            if (geraten < zahl) {
                System.out.println("Zu niedrig");
            }
            else if (geraten > zahl) {
                System.out.println("Zu hoch.");
            }
            else {
                System.out.printf("Richtig in %d Versuchen", versuche);
                break;
            }
        }

    }

}
