package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController,DigitalController{

    private AnalogController a = new AnalogControllerImpl();
    private DigitalController b = new DigitalControllerImpl();


    @Override
    public void up() {
        b.up();

    }

    @Override
    public void down() {
        b.down();
    }

    @Override
    public void left() {
        b.left();

    }

    @Override
    public void right() {
        b.right();
    }

    @Override
    public void up(double prcnt) {
        a.up(prcnt);

    }

    @Override
    public void down(double prcnt) {
        a.down(prcnt);


    }

    @Override
    public void left(double prcnt) {
        a.left(prcnt);

    }

    @Override
    public void right(double prcnt) {

        a.right(prcnt);


    }

    @Override
    public Point getPosition() {

        int x_a= a.getPosition().x;
        int y_a= a.getPosition().y;
        int x_b=b.getPosition().x;
        int y_b=b.getPosition().y;
        Point res = new Point(x_a+x_b,y_a+y_b);
        return res;
    }

}
