import java.util.Scanner;

public class program21{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            String octal = Integer.toOctalString(decimal);

            System.out.println("Octal: " + octal);

            input.close();
        }
    }
}