public class Program15 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        System.out.println("Before swap: a = " + a + " b = " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap: a = " + a + " b = " + b);
    
    }
}