package lab01;
import java.util.Scanner;
public class task03 {
    final static int PASSWORD = 3011;
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter password-number: ");
            int inputPassword = in.nextInt();
            if (inputPassword == PASSWORD){
                    System.out.println("Hello, Agent");
}
            else {
                    System.out.println("Access denied");
}
}
}