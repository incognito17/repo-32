package firma_m.bestellwesen_m;
import firma_m.daten_m.Kunde;

/**
 * Eine Bestellung.
 */
public class Bestellung {
    
    /** Kunde, der die Bestellung aufgegeben hat. */
    private Kunde kunde;

    /** Einzelnen Positionen der Bestellung. */
    private Bestellposition[] positionen;
}
