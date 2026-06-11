import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        double add = n1 + n2;
        double sub = n1 - n2;
        double mul = n1 * n2;
        if (n2 == 0) System.out.println("Division: cannot divide by zero.");
        else System.out.println("Division: " + (n1 / n2));
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        sc.close();
    }
}
