import java.util.Scanner;
public class program12 {
    public static double avg(double a, double b, double c){
        double avg = (a + b + c)/3;
        return avg;
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter first number: ");
            double a = input.nextDouble();
            System.out.print("Enter second number: ");
            double b = input.nextDouble();
            System.out.print("Enter third number: ");
            double c = input.nextDouble();

            System.out.println("Average: " + avg(a, b, c));
        }
    }
}
