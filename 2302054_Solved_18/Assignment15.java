
import java.util.Scanner;

public class Assignment15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt(), original = num, sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            System.out.println((original == sum) ? "Armstrong" : "Not Armstrong");
        }
    }
}
