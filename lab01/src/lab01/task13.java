package lab01;
import java.util.Scanner;
import java.util.Arrays;
public class task13 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = in.nextInt();
    int[] intarray = new int[size];
    System.out.print("Enter array numbers: ");
    for (int i = 0 ; i < size ; i++){
        intarray[i] = in.nextInt();
        }
    int[] result = removeLocalMaxima(intarray);
    System.out.println("Your array: " + Arrays.toString(intarray));
    System.out.println("Result array: " + Arrays.toString(result));
    }
    public static int[] removeLocalMaxima(int[] intarray) {
    int n = intarray.length;
    int count = 0;
    int[] resarray = new int[n];
    for (int i = 0 ; i < n ; i++){
        boolean maximum = false;
        if (i == 0){
            if (intarray[i] > intarray[i + 1]){
            maximum = true;
            }
    }
    else if(i == n - 1){
        if(intarray[i] > intarray[i - 1]){
            maximum = true;
            }
        }
    else{
        if(intarray[i] > intarray[i - 1] && intarray[i] > intarray[i + 1]){
            maximum = true;
            }
        }
    if (!maximum){
        resarray[count++] =intarray[i]; 
        }
    }
    return Arrays.copyOf(resarray, count);
    }
}
