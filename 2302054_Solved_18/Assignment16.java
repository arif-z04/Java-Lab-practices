import java.util.Scanner;

public class Assignment16 {
    public static int fib(int n) {
        if (n <= 1) return n; 
        return fib(n - 1) + fib(n - 2); 
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(n + "th Fibonacci number is " + fib(n));
        }
    }
}
