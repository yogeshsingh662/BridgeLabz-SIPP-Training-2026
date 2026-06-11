import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) { System.out.println("Please enter a positive integer."); sc.close(); return; }
        System.out.println("Multiples of " + n + " below 100:");
        for (int m = n; m < 100; m += n) {
            System.out.println(m);
        }
        sc.close();
    }
}
