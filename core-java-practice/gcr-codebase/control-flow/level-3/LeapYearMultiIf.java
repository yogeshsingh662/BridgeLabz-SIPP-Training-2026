import java.util.Scanner;

public class LeapYearMultiIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Year must be >= 1582 for Gregorian calendar.");
        } else {
            // Multiple if-else checks
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year (divisible by 400).");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year (century not divisible by 400).");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year (divisible by 4 and not by 100).");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            // Single if using logical operators
            boolean isLeap = (year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
            System.out.println("(Single-if check) " + year + (isLeap ? " is a Leap Year." : " is NOT a Leap Year."));
        }
        sc.close();
    }
}
