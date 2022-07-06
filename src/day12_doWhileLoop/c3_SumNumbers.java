package day12_doWhileLoop;

import java.util.Scanner;

public class c3_SumNumbers {

    ///task
    //write a do-while that asks the user enter two numbers
    //the numbers should be added and sum displayed
    //the loop should ask the user whether he or she wishes to perform the operation again
    //if so, the loop should repeat ; otherwise it should terminate
    //if user says y or Y continue
    //if user says n or N stop the loop

    public static void main(String[] args) {

        int number1 , number2 ;
        char choice; // y or n
        Scanner input=new Scanner(System.in);

        do {
            // ask user to enter a number
            System.out.println("Enter First Number");
            number1=input.nextInt();

            System.out.println("Enter Second Number");
            number2=input.nextInt();

            // the numbers should be added and the sum displayed
            int sum = number1+number2;
            System.out.println("Sum of "+ number1+ " + "+number2+ " is : "+sum);

            //the loop should ask the user whether he or she wishes to perform the operation again
            //if so, the loop should repeat ; otherwise it should terminate
            //if user says y or Y continue
            //if user says n or N stop the loop

            System.out.println("Do you want to sum new numbers y/n");
            choice=input.next().charAt(0);

        }while (choice== 'y' || choice== 'Y');













    }
}
