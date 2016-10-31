package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController  {



    private double x=0.0;
    private double y=0.0;

    @Override
    public void up(double prcnt) {
        // TODO Auto-generated method stub

        y-=prcnt;
    }

    @Override
    public void down(double prcnt) {
        // TODO Auto-generated method stub
        y+=prcnt;

    }

    @Override
    public void left(double prcnt) {
        // TODO Auto-generated method stub
       x-=prcnt;

    }

    @Override
    public void right(double prcnt) {
        // TODO Auto-generated method stub
       x+=prcnt;

    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub

        int x = (int)this.x;
        int y = (int)this.y;
        return new Point(x,y);
    }



}
