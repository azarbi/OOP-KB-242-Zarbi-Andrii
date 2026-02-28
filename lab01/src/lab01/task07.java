package lab01;
import java.util.Scanner;
public class task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a numbers in array: ");
        int numbers = in.nextInt();
        int max = numbers;
        while (numbers != 0){ 
            if (max < numbers){
                max = numbers;
        }
            numbers = in.nextInt();
        }
        System.out.printf("Result: %d\n", max);        
    }
}
