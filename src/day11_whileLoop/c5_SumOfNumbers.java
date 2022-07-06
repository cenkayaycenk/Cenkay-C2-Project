package day11_whileLoop;

import java.util.Scanner;

public class c5_SumOfNumbers {
    public static void main(String[] args) {

        //create a java that will sum of the given numbers
        //example.. if input is 5 ;
        //output will be 1+2+3+4+5==15

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=input.nextInt(); //this will read what user enters
        System.out.println("number is " + number);

        int start=0;
        //you have to print sum result
        int sum=0;

        while (start<=number){//0 1 2 3 4 >3
            //   System.out.println("Sum is the while loop : " + sum);
            sum+=start;//+1 +2 +3
            //  System.out.println("Sum is after =+ sign " + sum);
            start++;
        }
        System.out.println("Sum is at the end " + sum);


    }




}
