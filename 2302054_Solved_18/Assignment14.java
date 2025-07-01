
import java.util.Scanner;

public class Assignment14 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int rev = 0;
            int org = num;

            while (num != 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            System.out.println((org == rev) ? "Palindrome" : "Not Palindrome");
        }
    }
}
