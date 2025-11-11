import java.util.Scanner;

public class FahrToCels {
public static void main(String[] args){

Scanner keyboard = new Scanner(System.in);
double input = 0.0;
System.out.println("Input Fahrenheit amount: ");
input = keyboard.nextDouble();

double celsius = ((input - 32) * (5.0/9.0));

System.out.println("Celsius amount is: " + celsius);
keyboard.close();

}
}


