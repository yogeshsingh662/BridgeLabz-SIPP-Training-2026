import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        int minAge = ages[0];
        int minIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) { minAge = ages[i]; minIdx = i; }
        }
        double maxHeight = heights[0];
        int maxIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) { maxHeight = heights[i]; maxIdx = i; }
        }
        System.out.println("Youngest: " + names[minIdx] + " (" + minAge + ")");
        System.out.println("Tallest: " + names[maxIdx] + " (" + maxHeight + " cm)");
        sc.close();
    }
}
