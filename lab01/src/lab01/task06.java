package lab01;
import java.util.Scanner;
public class task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a bill: ");
        double bill = in.nextDouble();
        System.out.print("Enter number of friends: ");
        int friends = in.nextInt();
        if (friends == 0){
            System.out.println("Enter correct number of friends!");
        }
        else if (bill < 0){
            System.out.println("Enter correct number of bill!");
        }
        else{
            double result = (bill + 0.1 * bill) / friends;
            System.out.printf("Result: %.0f\n", result);
        }
    }
}
