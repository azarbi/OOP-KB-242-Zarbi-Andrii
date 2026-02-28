package lab01;
import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter people-number: ");
            int number = in.nextInt();
            in.nextLine();
            if (number < 0){
                System.out.println("Number is below 0!");
            }
            else if (number == 0){
                System.out.println("Enter number that >0!");
            }
            else{
            for (int i = 0 ; i < number ; i++) {
                    System.out.print("Enter name: ");
                    String name = in.nextLine();
                    System.out.printf("Hello, %s\n", name);
}
}
}
}
