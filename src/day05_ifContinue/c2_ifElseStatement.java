package day05_ifContinue;

public class c2_ifElseStatement {

    public static void main (String [] args){

        // please create a java program to check if this 2 numbers equal or not
        // if it is equal : number are equal
        // if it not print : numbers are not equal


        int x=20;
        int y=20;

        if (x==y){
            System.out.println("Numbers are equal ");
        }
        if (x!=y){
            System.out.println("Numbers are not equal ");
        }

// There is another way to solve this problem // called else statement

        if (x==y){
            System.out.println("Numbers are equal ");
        }else { System.out.println("Numbers are not equal ");}



        // please create a java program that will check if the number is even or odd
        // even number divided by 2 and the remainder is 0////



        int a=8;

        if (a % 2 == 0){
            System.out.println(a + " is even number ");
        }else {System.out.println(a + " is odd number ");}





    }


}
