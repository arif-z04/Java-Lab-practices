import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        }
    }
}
