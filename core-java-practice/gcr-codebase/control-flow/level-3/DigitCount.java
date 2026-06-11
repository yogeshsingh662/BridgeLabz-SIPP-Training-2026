import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = Math.abs(sc.nextLong());
        int count = 0;
        if (n == 0) count = 1;
        while (n != 0) {
            n /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
