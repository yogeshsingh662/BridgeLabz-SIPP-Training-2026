import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unit = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        double total = unit * qty;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + qty + " and unit price is INR " + unit);
        sc.close();
    }
}
