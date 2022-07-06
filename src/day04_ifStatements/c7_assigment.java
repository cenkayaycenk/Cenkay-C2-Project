package day04_ifStatements;

public class c7_assigment {

    public static void main (String [] args){

// Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.

        int x= 15;
        int y= 20;
        int z= 25;
        int w= 30;

        System.out.println("The average of " + x + " , " + y + " , " + z + " and " + w + " is " + (x+y+z+w)/4 );

        System.out.println("***********");

//    please write a program that will return max number from 3 numbers

        int a= 1150;
        int b= 900;
        int c= 600;

        boolean aMax = a>b && a>c; // true & true ----true
        boolean bMax = b>a && b>c; // false & true ---- false
        boolean cMax = c>a && c>b; // false & false ---- false

        if (aMax){
            System.out.println("Maximum number is :" + a);
        }
        if (bMax){
            System.out.println("Maximum number is :" + b);
        }
        if (cMax){
            System.out.println("Maximum number is :" + c);
        }

    System.out.println("******************");


  //  Write a Java program to compare two numbers

        int r= 25;
        int s=39;

        boolean equal= 25==39;
        boolean notEqual= 25!=29;
        boolean small= 25<39;
        boolean big= 25>39;
        boolean smallequal= 25<=39;
        boolean bigequal = 25>=39;

        if (equal){
            System.out.println(r + " is equal to " + s);
        }
        if (notEqual){
            System.out.println(r + " is not equal to " + s);
        }if (small){
            System.out.println(r + " smaller than " + s);
        }if (big){
            System.out.println(r + " bigger " + s);
        }if (smallequal){
            System.out.println(r + " is smaller and equal to " + s);
        }if (bigequal){
            System.out.println(r + " is bigger and equal to " + s);
        }

        System.out.println("**********************");

// create a java program to check number is positive or negative

        int n= 10;

        boolean poz= n>0;
        boolean neg= n<0;

        if (poz){
            System.out.println(n + " is a positive number ");
        }
        if (neg){
            System.out.println(n + " is a negative number ");
        }













    }


















}
