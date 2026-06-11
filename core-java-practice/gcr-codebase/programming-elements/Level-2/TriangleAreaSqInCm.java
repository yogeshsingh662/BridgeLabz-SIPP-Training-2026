import java.util.Scanner;

public class TriangleAreaSqInCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / 6.4516; // 1 sq in = 6.4516 sq cm
        System.out.printf("Area (sq in): %.4f\n", areaIn);
        System.out.printf("Area (sq cm): %.4f\n", areaCm);
        sc.close();
    }
}
