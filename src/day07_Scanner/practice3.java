package day07_Scanner;

import java.util.Scanner;

public class practice3 {

    //Question 5
//Positive, negative or zero
//Write a program that prompts the user to input a number.
// The program should then output the number and a message saying whether
// the number is positive, negative, or zero.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number");

        int number = scan.nextInt();

        String result = (number > 0) ? number + " is a positive number"
                : (number < 0) ? number + " is a negative number"
                : "The number is zero";

        System.out.println(result);









    }




}
