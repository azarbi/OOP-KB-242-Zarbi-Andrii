package lab01;
import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = in.nextLine();
            System.out.printf("Hello, %s!\n", name);
    }
}