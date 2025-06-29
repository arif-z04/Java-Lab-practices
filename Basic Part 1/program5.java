
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a, b;
            System.out.print("Input first number: ");
            a = input.nextInt();
            System.out.print("Input second number: ");
            b = input.nextInt();
            System.out.println(a + " x " + b + " = "+ a * b);
        }
    }
}
