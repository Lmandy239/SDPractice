import java.util.Scanner;

public class NumSign{

    public static void main (String[] args){

    Scanner kb = new Scanner(System.in);
    double input = 0;

    System.out.println("Enter a number: ");
    input = kb.nextDouble();
    if(input > 0){
    System.out.println("Your number is: " + input + " and it is positive.");
    }else if(input < 0){
    System.out.println("Your number is: " + input + " and it is negative.");
    }else{
    System.out.println("Your number is zero");
    }

    }

}