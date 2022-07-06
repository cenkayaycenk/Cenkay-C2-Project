package day07_Scanner;

import java.util.Scanner;

public class practice2 {

    //Question 4
//Largest Number
//Write a program that asks the user to enter a numbers in three
//variables and then displays the largest number.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
            int num1 = scan.nextInt();
        System.out.println("Enter the second number");
            int num2 = scan.nextInt();
        System.out.println("Enter the third number");
            int num3 = scan.nextInt();

            int MaxNumber = (num1>num2 && num1>num3) ? num1
                    : (num2>num1 && num2>num3) ? num2
                    : num3;


        System.out.println("The largest number is " + MaxNumber);





    }



}
