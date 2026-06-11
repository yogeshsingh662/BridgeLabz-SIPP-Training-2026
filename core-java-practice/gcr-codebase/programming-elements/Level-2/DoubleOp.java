import java.util.Scanner;

public class DoubleOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (double): ");
        double a = sc.nextDouble();
        System.out.print("Enter b (double): ");
        double b = sc.nextDouble();
        System.out.print("Enter c (double): ");
        double c = sc.nextDouble();
        double r1 = a + b * c;
        double r2 = a * b + c;
        double r3 = c + a / b;
        double r4 = a % b + c;
        System.out.println("Results of Double Operations: " + r1 + ", " + r2 + ", " + r3 + ", " + r4);
        sc.close();
    }
}
