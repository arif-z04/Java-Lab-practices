import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input first number: ");
            int a = input.nextInt();
            System.out.print("Input second number: ");
            int b = input.nextInt();
            
            System.out.println(a + " + " + b + " = "+ (a+b));
            System.out.println(a + " - " + b + " = "+ (a-b));
            System.out.println(a + " x " + b + " = "+ (a*b));
            System.out.println(a + " / " + b + " = "+ (a/b));
            System.out.println(a + " mod " + b + " = "+ (a%b));
        }
    }
}
