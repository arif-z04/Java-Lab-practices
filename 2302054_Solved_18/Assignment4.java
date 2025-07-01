
import java.util.Scanner;

public class Assignment4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total price: ");
            double total = sc.nextDouble();
            System.out.print("Enter number of months: ");
            int months = sc.nextInt();

            double installment = total / months;
            System.out.println("Monthly Installment: " + installment);
        }
    }
}
