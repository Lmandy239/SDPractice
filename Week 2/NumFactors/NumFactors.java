package NumFactors;

import java.util.Scanner;

public class NumFactors {

public static void main(String[] args){

double answer;
Scanner input = new Scanner(System.in);
System.out.println("Enter a number");
answer = input.nextDouble();

if(answer % 2 == 0){
    System.out.println("Even number");

    if(answer > 10 && answer < 100){
    System.out.println("Divisible by 10");
    }

    if(answer > 100){
        System.out.println("Divisible by 100");
    }

}else if(answer % 2 != 0){
    System.out.println("Odd");

    if(answer > 10 && answer < 100){
    System.out.println("Divisible by 10");
    }

    if(answer > 100){
        System.out.println("Divisible by 100");
    }
}


}
}
