import java.util.*;
public class program7 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input a number: ");
            int number = input.nextInt();

            for(int i = 1; i <= 10; i++){
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            input.close();
        }
    }
}
