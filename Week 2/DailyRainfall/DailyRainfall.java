package DailyRainfall;

import java.util.Scanner;

public class DailyRainfall {

    public static void main(String[] args) {

        // Write a program that accepts numeric values for the total daily rainfall for
        // a week. Print the daily rainfall and calculate and print the total rainfall
        // for the week, as well as the average rainfall for the week.
        
        Scanner input = new Scanner(System.in);
        double[] week = new double[7];
        double answer = 0;
        //Prompt
        System.out.println("Insert the total rainfall (inches) for day one of the week: ");
        answer = input.nextDouble();
        week[0] = answer;
    
        System.out.println("Insert the total rainfall (inches) for day two of the week: ");
        answer = input.nextDouble();
        week[1] = answer;
        
        System.out.println("Insert the total rainfall (inches) for day three of the week: ");
        answer = input.nextDouble();
        week[2] = answer;
        
        System.out.println("Insert the total rainfall (inches) for day four of the week: ");
        answer = input.nextDouble();
        week[3] = answer;
        
        System.out.println("Insert the total rainfall (inches) for day five of the week: ");
        answer = input.nextDouble();
        week[4] = answer;
        
        
        System.out.println("Insert the total rainfall (inches) for day six of the week: ");
        answer = input.nextDouble();
        week[5] = answer;
        
        
        System.out.println("Insert the total rainfall (inches) for day seven of the week: ");
        answer = input.nextDouble();
        week[6] = answer;
        
        double total = 0;
        total = (week[0] + week[1] + week[2] + week[3] + week[4] + week[5] + week[6]);
        double average = total / week.length;
        
        System.out.println("Total rainfall for the week is: " + total);
            
        System.out.println("Average rainfall for the week is: " + average);

        input.close();
    }
}
