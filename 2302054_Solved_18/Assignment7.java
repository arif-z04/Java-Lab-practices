
import java.util.*;

public class Assignment7 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            if (num < 10 || num > 100) {
                System.out.print("Number is less than 10 or greater than 100.");
            } else {
                System.out.println("Number is between 10 and 100");
            }
        }
    }
}
