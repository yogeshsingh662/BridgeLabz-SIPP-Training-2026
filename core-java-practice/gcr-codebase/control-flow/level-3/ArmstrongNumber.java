import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit; // cube
            original /= 10;
        }
        if (sum == number) System.out.println(number + " is an Armstrong number.");
        else System.out.println(number + " is NOT an Armstrong number.");
        sc.close();
    }
}
