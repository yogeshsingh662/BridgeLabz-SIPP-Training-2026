import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (integer): ");
        long base = sc.nextLong();
        System.out.print("Enter exponent (non-negative integer): ");
        int exp = sc.nextInt();
        if (exp < 0) { System.out.println("Exponent must be non-negative."); sc.close(); return; }
        long result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        System.out.println(base + "^" + exp + " = " + result);
        sc.close();
    }
}
