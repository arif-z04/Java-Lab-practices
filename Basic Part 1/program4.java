import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class Program4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Expression: ");
            String exp = input.nextLine();
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            try {
                Object result = engine.eval(exp);
                System.out.println(result);
                
            } catch (ScriptException e) {
                System.out.println("Invalid expression!");
            }

    }
    }
}