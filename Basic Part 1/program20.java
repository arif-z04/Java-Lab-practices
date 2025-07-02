import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            String hex = Integer.toHexString(decimal).toUpperCase();

            System.out.println("Hexadecimal: " + hex);
        }
    }
}
