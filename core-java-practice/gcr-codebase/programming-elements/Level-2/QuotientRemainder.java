import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend (integer): ");
        int a = sc.nextInt();
        System.out.print("Enter divisor (integer): ");
        int b = sc.nextInt();
        if (b == 0) { System.out.println("Cannot divide by zero."); sc.close(); return; }
        int q = a / b;
        int r = a % b;
        System.out.println("The Quotient is " + q + " and Remainder is " + r + " of two numbers " + a + " and " + b);
        sc.close();
    }
}
