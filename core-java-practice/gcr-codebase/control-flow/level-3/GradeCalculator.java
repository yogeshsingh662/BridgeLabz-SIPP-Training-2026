import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double p = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double c = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double m = sc.nextDouble();
        double avg = (p + c + m) / 3.0;
        String grade, remarks;
        if (avg >= 90) { grade = "A"; remarks = "Excellent"; }
        else if (avg >= 80) { grade = "B"; remarks = "Very Good"; }
        else if (avg >= 70) { grade = "C"; remarks = "Good"; }
        else if (avg >= 60) { grade = "D"; remarks = "Average"; }
        else { grade = "F"; remarks = "Fail"; }
        System.out.printf("Average Marks: %.2f\n", avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}
