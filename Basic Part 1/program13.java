
import java.util.Scanner;

public class program13 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Width: ");
            double Width = input.nextDouble();
            System.out.print("Height: ");
            double Height = input.nextDouble();

            System.out.println("Area is "+ Width + " * " + Height + " = " + (Width * Height));
            System.out.printf("Perimeter is 2 * (%.2f + %.2f) = %.2f", Width, Height, 2 * (Width + Height));


            input.close();
        }
    }
}
