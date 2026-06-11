import java.util.Scanner;

public class OddEvenToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + ((i % 2 == 0) ? "even" : "odd"));
        }
        sc.close();
    }
}
