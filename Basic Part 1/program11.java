import java.util.Scanner;

public class Program11 {

    public static double area_circle(double radius){
        double area = Math.PI * radius * radius;
        return area;
    }

    public static double perimeter(double radius){
        double peri = 2 * Math.PI * radius;
        return peri;
    }
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Radius");
            double radius = input.nextDouble();

            double area = area_circle(radius);
            double peri = perimeter(radius);

            System.out.println("Area: " + area);
            System.out.println("Permeter: " + peri);
        
            input.close();
        }
    }
    
}

