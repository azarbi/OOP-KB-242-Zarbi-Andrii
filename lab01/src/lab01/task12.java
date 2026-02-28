package lab01;
import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = in.nextInt();
    if (size < 2){
        System.out.println("Array myst have at least 2 elements!");
        return;
    }
    int[] intarray = new int[size];
    System.out.print("Enter array numbers: ");
    for (int i = 0 ; i < size ; i++){
        intarray[i] = in.nextInt();
        }
    boolean[] resarray = getSumCheckArray(intarray);
    System.out.print("Result: ");
    for (int i = 0 ; i < size ; i++){
        System.out.print(resarray[i] + ", ");
        }
}
    public static boolean[] getSumCheckArray(int[] intarray) {
    boolean[] resarray = new boolean[intarray.length];
    resarray[0] = false;
    resarray[1] = false;
    for (int j = 2 ; j < intarray.length ; j++){
        resarray[j] = intarray[j - 2] + intarray[j - 1] == intarray[j];
        }
    return resarray;
    }    
}
