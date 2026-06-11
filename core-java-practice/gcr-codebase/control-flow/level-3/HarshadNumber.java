import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = Math.abs(n);
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (sum == 0) System.out.println("Sum of digits is 0; cannot divide.");
        else if (n % sum == 0) System.out.println(n + " is a Harshad Number.");
        else System.out.println(n + " is NOT a Harshad Number.");
        sc.close();
    }
}
