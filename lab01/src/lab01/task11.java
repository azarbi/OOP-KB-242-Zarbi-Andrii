package lab01;
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = in.nextInt();
    int[] intarray = new int[size];
    if (size <= 0){
        System.out.println("Array is empty.");
        return;
    }
    System.out.print("Enter array numbers: ");
    for (int i = 0 ; i < size ; i++){
        intarray[i] = in.nextInt();
    }
    int res = sum(intarray);
    System.out.printf("Result: %d\n", res);
}
    public static int sum(int intarray[]) {
    int sum = 0; 
    if (intarray == null || intarray.length == 0){
        return 0;
    }
    for (int j = 0 ; j < intarray.length ; j++){
        if (intarray[j] % 2 == 0){
            sum += intarray[j];
    }
    }
    return sum;    
    }
}
