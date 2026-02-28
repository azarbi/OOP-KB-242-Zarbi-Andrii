package lab01;
import java.util.Scanner;
import java.util.Arrays; 
public class task14 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = in.nextInt();
    int[] array = new int[size];
    System.out.print("Enter array numbers: ");
    for (int i = 0 ; i < size ; i++){
        array[i] = in.nextInt();
        }
    int[] copy = Arrays.copyOf(array, array.length);
    cycleSwap(array);
    System.out.println("Array after cycling for 1 step: " + Arrays.toString(array));
    cycleSwap(copy, 3);
    System.out.println("Array after cycling for shift steps: " + Arrays.toString(copy));
    }
    public static void cycleSwap(int[] array){
    int last = array[array.length - 1];
    for (int i = array.length - 1 ; 0 < i ; i--){
        array[i] = array[i - 1];
        }
        array[0] = last;
        }
    public static void cycleSwap(int[] array, int shift){
    shift = shift % array.length;
    for (int s = 0 ; s < shift ; s++){
        int last = array[array.length - 1];
        for (int i = array.length - 1 ; 0 < i ; i--){
            array[i] = array[i - 1];
            }
        array[0] = last;
        }
    }
}