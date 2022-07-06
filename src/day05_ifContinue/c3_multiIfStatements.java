package day05_ifContinue;

public class c3_multiIfStatements {

    public static void main(String[] args) {

        // CHECK 2 NUMBERS
        // check if they are equal
        // check 1 of them is bigger
        // check 1 of them is smaller

        int x = 45;
        int y = 45;

        if (x == y) {
            System.out.println(x + " is equal to " + y);
        } else if (x > y) {
            System.out.println(x + " is bigger then " + y);
        } else {
            System.out.println(x + " is smaller then " + y);
        }

// else will cover what ever left from if and if else conditions. it will be at hte end.

        // starting point is 0                                      print  you are at starting point
        // ending  point  is 10                                     print  you are at ending point
        // between those numbers (0-10) will be  on my way          print  you are on your way
        // anything left will be wrong way                          print some warning mesegaes


        int a=9;

        if (a==0){
            System.out.println("You are at starting point");
        }else if (a==10){
            System.out.println("You are at ending point");
        }else if (a<10 && a>0){
            System.out.println("You are on your way ");
        }else {System.out.println("Some warning messages");
        }










    }
}