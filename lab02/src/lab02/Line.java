package lab02;
import java.util.Scanner;
public class Line{
    double k;
    double b;
    public Line(double k, double b){
        this.k = k;
        this.b = b;
    }
    public Point intersection(Line other){
        if (this.k == other.k){
            return null;
        }
        double x = (other.b - this.b) / (this.k - other.k);
        double y = this.k * x + this.b;
        return new Point(x, y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter k for first line: ");
        double k1 = in.nextDouble();
        System.out.println("Enter b for first line: ");
        double b1 = in.nextDouble();
        System.out.println("Enter k for second line: ");
        double k2 = in.nextDouble();
        System.out.println("Enter b for second line: ");
        double b2 = in.nextDouble();
        Line line1 = new Line(k1, b1);
        Line line2 = new Line(k2, b2);
        if(line1.intersection(line2) != null){
            System.out.println("Point: " + line1.intersection(line2));
        } 
        else{
            System.out.println("Point not found.");
        }
    }
}