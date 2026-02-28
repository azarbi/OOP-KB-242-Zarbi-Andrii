package lab01;
import java.util.Scanner;
public class task08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a numbers in array: ");
        int numbers = in.nextInt();
        int sum = 0;
        int count = 0;
        while (numbers != 0){
            sum = sum + numbers;
            count++;
            numbers = in.nextInt();
        }
        int average = sum / count;
        System.out.printf("Average: %d\n", average);        
    }
    }
