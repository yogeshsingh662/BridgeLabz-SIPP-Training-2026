import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (>1): ");
        int n = sc.nextInt();
        if (n <= 1) { System.out.println("No factors other than itself."); sc.close(); return; }
        int greatestFactor = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) { greatestFactor = i; break; }
        }
        System.out.println("Greatest factor of " + n + " besides itself is " + greatestFactor);
        sc.close();
    }
}
