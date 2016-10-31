package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController,DigitalController{

    private AnalogController a = new AnalogControllerImpl();
    private DigitalController b = new DigitalControllerImpl();


    @Override
    public void up() {
        // TODO Auto-generated method stub
        b.up();

    }

    @Override
    public void down() {
        // TODO Auto-generated method stub
        b.down();
    }

    @Override
    public void left() {
        // TODO Auto-generated method stub
        b.left();

    }

    @Override
    public void right() {
        // TODO Auto-generated method stub
        b.right();
    }

    @Override
    public void up(double prcnt) {
        // TODO Auto-generated method stub
        a.up(prcnt);

    }

    @Override
    public void down(double prcnt) {
        // TODO Auto-generated method stub
        a.down(prcnt);


    }

    @Override
    public void left(double prcnt) {
        // TODO Auto-generated method stub
        a.left(prcnt);

    }

    @Override
    public void right(double prcnt) {
        // TODO Auto-generated method stub

        a.right(prcnt);


    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub

        int x_a= a.getPosition().x;
        int y_a= a.getPosition().y;
        int x_b=b.getPosition().x;
        int y_b=b.getPosition().y;
        Point res = new Point(x_a+x_b,y_a+y_b);
        return res;
    }

}
