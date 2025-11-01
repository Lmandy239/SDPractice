import java.util.Scanner;

public class FiveIntegers {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert a number(1): ");
        int number1 = keyboard.nextInt();
        System.out.println("Insert a number(2): ");
        int number2 = keyboard.nextInt();
        System.out.println("Insert a number(3): ");
        int number3 = keyboard.nextInt();
        System.out.println("Insert a number(4): ");
        int number4 = keyboard.nextInt();
        System.out.println("Insert a number(5): ");
        int number5 = keyboard.nextInt();

        System.out.println(number1 + " " + number2 + " " + number3
        + " " + number4 + " " + number5 + ".");
    }

}
