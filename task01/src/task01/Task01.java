package task01;
import java.util.Scanner;
public class Task01{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your first name: ");
            String first = in.nextLine();
            System.out.print("Enter your last name: ");
            String last = in.nextLine();
            System.out.print("Enter your number A: ");
            int A = in.nextInt();
            System.out.print("Enter your number B: ");
            int B = in.nextInt();
            System.out.printf("First name: %s; Last name: %s; Number A: %d; Number B: %d\n", first, last, A, B);
        }
}