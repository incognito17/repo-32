package tpe.oo.factory.figuren;

import tpe.oo.factory.GameBoard;

public class FigurFactory {

    GameBoard d= new GameBoard();


    Figur createFigur(){

        Figur [] test = new Figur [2];
        test[0]= new Lady(d);





        return null;

    }
public static void main(String[] args) {

    int test = (int) (4*Math.random());

    System.out.println(test);

}
}
