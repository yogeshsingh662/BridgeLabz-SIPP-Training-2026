import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (>1): ");
        int n = sc.nextInt();
        if (n <= 1) { System.out.println("No factors other than itself."); sc.close(); return; }
        int greatestFactor = 1;
        int counter = n - 1;
        while (counter >= 1) {
            if (n % counter == 0) { greatestFactor = counter; break; }
            counter--;
        }
        System.out.println("Greatest factor of " + n + " besides itself is " + greatestFactor);
        sc.close();
    }
}
