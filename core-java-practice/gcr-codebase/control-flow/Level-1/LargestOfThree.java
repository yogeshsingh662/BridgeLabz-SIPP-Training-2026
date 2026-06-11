import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers (space separated): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean firstLargest = (a >= b) && (a >= c);
        boolean secondLargest = (b >= a) && (b >= c);
        boolean thirdLargest = (c >= a) && (c >= b);
        System.out.println("Is the first number the largest? " + (firstLargest ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (secondLargest ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (thirdLargest ? "Yes" : "No"));
        sc.close();
    }
}
