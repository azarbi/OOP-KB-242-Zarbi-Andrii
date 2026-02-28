package lab01;
import java.util.Scanner;
public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Sec = scanner.nextInt();
        int Hours = (Sec / 3600) % 24;
        int Minutes = (Sec % 3600) / 60;
        int Seconds = Sec % 60;
        System.out.printf("%d:%02d:%02d\n", Hours, Minutes, Seconds);
    }
}