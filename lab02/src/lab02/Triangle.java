package lab02;
import java.util.Scanner;
public class Triangle{
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c){
        if(a.x == b.x && a.y == b.y || b.x == c.x && b.y == c.y || a.x == c.x && a.y == c.y){
            throw new IllegalArgumentException("Two points are equal!");
        }
        double S = Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2;
        if(S == 0){
            throw new IllegalArgumentException("Triangle can't exist!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area(){
        return Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2;
    }
    public Point centroid(){
        double x = (a.x + b.x + c.x) / 3;
        double y = (a.y + b.y + c.y) / 3;
        return new Point(x, y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x for point A: ");
        double x1 = in.nextDouble();
        System.out.println("Enter y for point A: ");
        double y1 = in.nextDouble();
        System.out.println("Enter x for point B: ");
        double x2 = in.nextDouble();
        System.out.println("Enter y for point B: ");
        double y2 = in.nextDouble();
        System.out.println("Enter x for point C: ");
        double x3 = in.nextDouble();
        System.out.println("Enter y for point C: ");
        double y3 = in.nextDouble();
        Triangle triangle1 = new Triangle(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
        System.out.println("Area: " + triangle1.area());
        System.out.println("Centroid: " + triangle1.centroid());
        in.close();
    }
}
