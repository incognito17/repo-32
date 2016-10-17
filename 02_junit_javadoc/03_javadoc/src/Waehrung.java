/**Repräsentiert eine Währung
 * @author incognito
 *
 */
public class Waehrung {

    //Wechselkurs zum Dollar
    private final int kurs;

    // Name der Währung (z.B. Dollar, EURO, RUBEL etc..)
    private final String name;


    //Kürzel der Währung (z.B. $, rub, etc..)
    private final String kuerzel;

    // TODO: JavaDoc
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt. Das erzeugte Objekt ist die Währung, die man
     * instanziert mit Atttributen wie: "Name der Währung"; "Kürzel der Währung"; und
     * den aktuellen "Kurs";
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     * Führt eine Umrechnung durch, in dem der übergebene Parameter "betrag"
     * in die gewollte Währung (-ebenfalls als Parameter übergeben-) umgerechnet wird.
     * @param betrag - Der Betrag des Geldes, welchen man in die "Ziel-Währung
     * umwandeln will - hier als <i>long</i>
     * <p>
     * @param toWaehrung - Die "Ziel-Währung", die als Parameter übergeben wird, in
     * die man die aktuelle Währung umwandeln möchte.
     * <p>
     * @return Der neu umgerechnete Betrag des übergebenen wird als <i>long</i>
     * der Ziel-Währung zurückgegeben.
     *
     */

    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     * Gibt den Kurs des aktuellen Objekts zurück.
     *
     * @return kurs(int) der aktuelle Wechselkurs.
     */
    public int getKurs() {
        return kurs;
    }

    /**
     *Gibt den aktuellen Namen der Währung zurück.
     * @return name - aktuelle Name der Währung (z.B. DOLLAR, EURO, RUBEL...etc)
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt das Kürzel der aktuellen Währung des instanzierten Objekts zurück.
     *
     *
     * @return - {@code kuerzel: das aktuelle Kürzel (z.B. €)}
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
