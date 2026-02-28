package lab01;
import java.util.Scanner;
public class task05 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter height, in which a snail will come in one day (a): ");
            int a = in.nextInt();
            System.out.print("Enter height, in which a snail will go down (b): ");
            int b = in.nextInt();
            System.out.print("Enter height of wood (h): ");
            int h = in.nextInt();
            if (a >= h){
                System.out.println(1);
            }
            else if (a <= b){
                System.out.println("Impossible");
            }
            else {
                int result = (int)Math.ceil((double)(h - a) / (a - b)) + 1;
                System.out.println(result);
            }
    }
}
