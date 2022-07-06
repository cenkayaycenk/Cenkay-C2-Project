package day07_Scanner;

import java.util.Scanner;

public class practice {

    //Question 1
//Even or Odd
//Write a program that asks the user to enter a number
// and displays whether entered number is an odd number or even number.

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = Input.nextInt();


        if (number %2==0){
            System.out.println(number + " is an even number");
        }else{
            System.out.println(number + " Is an odd number");
        }











    }




}
