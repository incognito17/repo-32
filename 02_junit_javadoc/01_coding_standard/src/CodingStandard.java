/**
 * Klasse dient als Beispiel für den Coding-Standard und die Namenskonventionen
 * bei Java-Programmen.
 */
public class CodingStandard {

    /*
     * Konstante, die dem Rest der Welt etwas mitteilen soll.
     */
    public final static int KONSTANTEMITTOLLEMWERT = 3;

    private int erstesFeld;
    private double zweitesFeld;

    /*
     * Legt eine neue Instanz an.
     *
     * Erstes_Feld: das erste Feld. ZweitesFeld: das zweite Feld.
     */
    public CodingStandard(int erstesFeld, double zweitesFeld) {
        this.erstesFeld = erstesFeld;
        this.zweitesFeld = zweitesFeld;
    }

    /*
     * Methode, die etwas tut.
     *
     * parameter: Eingabewert für die Methode. gibt einen Wert abhängig von
     * {@code parameter} zurück.
     */
    public int methodeDieWasTut(int parameter) {
        int result;

        if (parameter > KONSTANTEMITTOLLEMWERT)
            result = 12;
        else {
            result = 13;
        }

        erstesFeld = result;
        zweitesFeld = 2 * result;

        return result;
    }

    public int getFirst() {

        return this.erstesFeld;
    }

    public double getSecond() {
        return this.zweitesFeld;
    }

    public static void main(String[] args) {

        CodingStandard test = new CodingStandard(2, 5);

        int a = test.getFirst();
        double b = test.getSecond();

        System.out.println(a + b);

    }

}
