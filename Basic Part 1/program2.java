
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String exp = sc.nextLine();
            
            String[] expParts = exp.split(" ");
            
            if(expParts.length != 3){
                System.out.println("Error!");
            }
            
            
            int n1 = Integer.parseInt(expParts[0]);
            String operator = expParts[1];
            int n2 = Integer.parseInt(expParts[2]);
            int result = 0;
            
            switch(operator){
                case "+" -> result = n1 + n2;
                    
                case "-" -> result = n1 - n2;
                    
                case "*" -> result = n1 * n2;
                    
                case "/" -> {
                    if(n2 != 0){
                        result = n1 / n2;
                    } else {
                        System.out.println("Error! Division by Zero.");
                    }
                }
                default -> System.out.println("Unsupported operator: "+ operator);
            }
            
            System.out.println(result);
        }
    }
}
