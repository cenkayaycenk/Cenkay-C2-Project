package day03_variablesContinue;

public class cenkayPractice {

    public static void main(String [] args){
//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println( "Hello" + "\nCenkay");

//2. Write a Java program to print the sum of two numbers.
//Test Data:
//74 + 36
        System.out.println(74 + 36);

//3. Write a Java program to divide two numbers and print on the screen.
//Test Data :
//50/3
        System.out.println(50/3);
//4. Write a Java program to print the result of the following operations.
//Test Data:
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8%3);

        //Write a Java program that takes two numbers as input and display the product of two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5

        int x=25;
        int y=5;
        System.out.println(x + " x " + y + " = " +  x*y);

//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24

        int a=125;
        int b=24;

        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "x" + b + "=" + (a*b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "/" + b + "=" + (a/b));

//7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//Test Data:
//Input a number: 8

        int z=8;
        int q=1;

        System.out.println(z + "x" + q + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );
        System.out.println(z + "x" + (++q) + "=" + (8*q) );

//11. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        int m1= 180;
        int m2= 220;
        int m3= 300;
        int m4= (m1+m2+m3)/3;

        System.out.println("Average of " + m1 + ", " + m2 +  " and " + m3 + " is " +  m4);

















    }


}
