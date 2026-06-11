import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean divisible = (n % 5) == 0;
        System.out.println("Is the number " + n + " divisible by 5? " + (divisible ? "Yes" : "No"));
        sc.close();
    }
}
