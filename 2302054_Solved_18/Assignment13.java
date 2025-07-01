import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a = 0, b = 1;
            int fib;
            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }

            System.out.println(n + "th Fibonacci number is " + (n == 0 ? a : b));
        }
    }
}
