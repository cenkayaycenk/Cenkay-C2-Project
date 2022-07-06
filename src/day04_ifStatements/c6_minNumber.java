package day04_ifStatements;

public class c6_minNumber {

    // 3 variables
    // x=400 -------y=200---------z=300
    // output should be min number

    public static void main (String [] args){

        int x=100;
        int y=400;
        int z=300;

        boolean xMin= x<y && x<z ; // false & false >>> false
        boolean yMin= y<x && y<z ; // true & true >>> true
        boolean zMin= z<x && z<y ; // true & false >>> false

        if (xMin){
            System.out.println("Minimum number is " + x); // false , it wont be printed
        }
        if (yMin){
            System.out.println("Minimum number is " + y ); // true , it will be printed
        }
        if (zMin){
            System.out.println("Minimum number is " + z); // false , it wont be printed
        }



    }



}
