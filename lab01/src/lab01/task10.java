package lab01;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = in.nextInt();
    int[] intarray = new int[size];
    System.out.print("Enter array numbers: ");
    for (int i = 0 ; i < size ; i++){
        intarray[i] = in.nextInt();
    }
    int res = max(intarray);
    System.out.printf("Maximum: %d\n", res);
    }
    
    public static int max(int intarray[]) {
    int max = intarray[0];  
    for (int j = 1 ; j < intarray.length ; j++){
        if (max < intarray[j]){
            max = intarray[j]; 
            }
    }
    return max;    
    }
}
