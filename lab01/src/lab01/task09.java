package lab01;
import java.util.Scanner;
public class task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter quadratic equation agruments a: ");
        double a = in.nextDouble();
        System.out.print("Enter quadratic equation agruments b: ");
        double b = in.nextDouble();
        System.out.print("Enter quadratic equation agruments c: ");
        double c = in.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0){
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            if (x1 > x2){
            double temp = x1;
            x1 = x2;
            x2 = temp;
            }
            System.out.printf("Result: %f %f \n", x1, x2);
        }
        else if (d == 0){
            double x = -b / (2 * a);
            System.out.printf("Result: \n x = %f \n", x);
        }
        else{
            System.out.print("no roots \n");
        }
    }
}
