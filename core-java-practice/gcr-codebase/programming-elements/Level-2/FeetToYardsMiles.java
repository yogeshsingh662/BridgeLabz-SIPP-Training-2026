import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        double yards = feet / 3.0;
        double miles = feet / 5280.0; // 5280 feet in a mile
        System.out.println("Distance in yards: " + yards);
        System.out.println("Distance in miles: " + miles);
        sc.close();
    }
}
