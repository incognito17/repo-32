package tpe.oo.interfaces.api;

import java.awt.Point;

public interface AnalogController {

    /**
     * Nach oben bewegen.
     */
    void up(double prcnt);


    /**
     * Nach unten bewegen.
     */
    void down(double prcnt);

    /**
     * Nach links bewegen.
     */
    void left(double prcnt);

    /**
     * Nach rechts bewegen.
     */
    void right(double prcnt);

    /**
     * Liefert die aktuelle Position zurück.
     *
     * @return Die Position.
     */
    Point getPosition();

}
