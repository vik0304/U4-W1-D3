import entities.Call;
import entities.Rectangle;
import entities.SIM;

public class Main {
    public static void main (String[] args){
//        primo esercizio
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(4, 5);
        r1.printRectangle();
        r2.printRectangle();
        Rectangle.print2Rectangles(r1, r2);
//        secondo esercizio
        SIM sim1 = new SIM ("1234567890");
        Call call1= new Call(sim1, 2, "4389843");
        Call call2= new Call(sim1, 3, "4385343");
        Call call3= new Call(sim1, 5, "4353539843");
        Call call4= new Call(sim1, 7, "03853243");
        Call call5= new Call(sim1, 24, "769843");
        System.out.println(sim1.toString());
//        terzo esercizio

    }
}
