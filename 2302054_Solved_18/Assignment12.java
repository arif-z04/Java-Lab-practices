import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int sum = 0;

            for (int i = m; i <= n; i++) {
                if (i % 2 != 0) sum += i;
            }

            System.out.println("Sum of odd numbers = " + sum);
        }
    }
}
