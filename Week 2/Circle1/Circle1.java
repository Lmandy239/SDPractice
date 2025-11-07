import java.util.Scanner;

public class Circle1 {

    public static void main(String[] args) {
        
    double pi = Math.PI;    
    Scanner input = new Scanner(System.in);

    System.out.println("Input a radius to calculate circumference: ");
    double radius = input.nextDouble();
    double circumference;
    circumference = (2 * pi) * radius;
    System.out.println(circumference);

    input.close();
    }
}
