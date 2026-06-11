import java.util.Scanner;

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double p = sc.nextDouble();
        double side = p / 4.0;
        System.out.println("The length of the side is " + side + " whose perimeter is " + p);
        sc.close();
    }
}
