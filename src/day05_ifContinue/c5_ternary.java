package day05_ifContinue;

public class c5_ternary {

    //this is another way of using else block

    // create an java program that prints max number from 2 number

    public static void main(String[] args) {

        int x=30;
        int x1=20;

        int max ; // this is to store max number
        String message = ""; // this is will be messaged that will print at the end

        if (x>x1){ // true
            max=x ;
        }else {max=x1; // false
        }
        message= "Maximum number is " + max ;
        System.out.println(message);

// ternary // another way of using if else block

        // create an java program that prints max number from 2 number

        int y=35;
        int y1=45;
        int max2;

        max2 = (y>y1) ? y : y1 ;

        // ? means if
        // : means else

        System.out.println("Maximum number is " + max2);


        // create an java program that prints max number from 2 number


        int a=15;
        int b=65;
        int c=45;

        int max4 ;

        String text = "";


                max4 = (a>b && a>c) ? a : (b>a) && (b>c)? b : c ;
        // is a>b and a>b max number is a////////if b>a and b>c max number b /// else c

                text = "Maximum number is " + max4;

        System.out.println(text);









    }





}
