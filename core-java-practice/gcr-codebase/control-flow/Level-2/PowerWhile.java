import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (integer): ");
        long base = sc.nextLong();
        System.out.print("Enter exponent (non-negative integer): ");
        int power = sc.nextInt();
        if (power < 0) { System.out.println("Exponent must be non-negative."); sc.close(); return; }
        long result = 1;
        int counter = 0;
        while (counter < power) {
            result *= base;
            counter++;
        }
        System.out.println(base + "^" + power + " = " + result);
        sc.close();
    }
}
