package entities;

public class Rectangle {
    private double l1;
    private double l2;
    private double p;
    private double area;

    public Rectangle(double l1, double l2){
        this.l1=l1;
        this.l2=l2;
        p = l1*2+l2*2;
        area = l1*l2;
    }

    public void printRectangle(){
        System.out.println("Il perimetro è "+p+" e invece l'area è "+area);
    }

    public static void print2Rectangles(Rectangle rectangle1, Rectangle rectangle2){
        double totalP= rectangle1.p + rectangle2.p;
        double totalArea= rectangle1.area + rectangle2.area;
        System.out.println("Il perimetro sommato è "+totalP+" e l'area sommata è "+totalArea);
    }
}
