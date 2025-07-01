
import java.util.Scanner;

public class Assignment8 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            if (num >= 10 && num <= 100) {
                System.out.println("Number is between 10 and 100");
            } else {
                System.out.println("Number is not between 10 and 100");
            }
        }
    }
}
