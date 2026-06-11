import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers (space separated): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean isFirstSmallest = (a < b) && (a < c);
        System.out.println("Is the first number the smallest? " + (isFirstSmallest ? "Yes" : "No"));
        sc.close();
    }
}
