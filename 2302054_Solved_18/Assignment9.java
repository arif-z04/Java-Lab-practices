
import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1. Internet\n2. Billing\n3. Technical\n4. Others");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    System.out.println("You selected Internet support.");
                case 2 ->
                    System.out.println("You selected Billing.");
                case 3 ->
                    System.out.println("You selected Technical Support.");
                case 4 ->
                    System.out.println("You selected Others.");
                default ->
                    System.out.println("Invalid Option.");
            }
        }
    }
}
