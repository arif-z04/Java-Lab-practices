
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.print("Enter your age: ");
            int age = input.nextInt();
            System.out.print("Enter your favorite subject: ");
            input.nextLine(); 
            String subject = input.nextLine();

            System.out.println("Name: " + name + ", Age: " + age + ", Favorite Subject: " + subject);
        }
    }
}
