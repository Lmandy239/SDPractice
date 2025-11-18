import java.util.Scanner;

public class CalculateTip {

public static void main(String[] args){

int choice;
double change;
Scanner input = new Scanner(System.in);

System.out.println("Please insert check: ");
change = input.nextDouble();

double calcChange = change; 

System.out.println("Select tip %: 1) 10%. 2) 15. 3) 20%. ");
choice = input.nextInt();

switch (choice) {
    case 1:
        calcChange = calcChange * 1.10;
        System.out.println("The total amount is: " + calcChange);
        break;

        case 2:
        calcChange = calcChange * 1.15;
        System.out.println("The total amount is: " + calcChange);
        
        break;

        case 3:
        calcChange = calcChange * 1.20;
        System.out.println("The total amount is: " + calcChange);
        
        break;

    default:
        System.out.println("Goodbye!");
        break;
}


input.close();

}

}
