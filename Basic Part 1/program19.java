import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            String binary = Integer.toBinaryString(decimal);

            System.out.println("Binary: " + binary);
        }    
    }
}