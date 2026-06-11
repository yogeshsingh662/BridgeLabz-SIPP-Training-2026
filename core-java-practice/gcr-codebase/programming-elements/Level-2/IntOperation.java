import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (int): ");
        int a = sc.nextInt();
        System.out.print("Enter b (int): ");
        int b = sc.nextInt();
        System.out.print("Enter c (int): ");
        int c = sc.nextInt();
        int r1 = a + b * c;
        int r2 = a * b + c;
        int r3 = c + a / b;
        int r4 = a % b + c;
        System.out.println("Results of Int Operations: " + r1 + ", " + r2 + ", " + r3 + ", " + r4);
        sc.close();
    }
}
