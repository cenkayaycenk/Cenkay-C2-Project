package day05_ifContinue;

public class c6_EvenOdd {

    public static void main(String[] args) {

        //create a java project that will check if number is even or odd

        int number ;

        number=25;
        String result = "";

        //lets try with if
        if (number % 2 == 0){
            result = number + " is even";
        }else {
            result = number + " is odd";
        }

        //shortcut of println is sout
        System.out.println(result);

        //ternary
        //if == ?
        //else == :

        String result2= (number % 2 == 0) ? number + " is even " : number + " is odd" ;

        System.out.println(result2);

//////// PRACTICE

        //create a java project that will check if number is even or odd

        int x;

        x= 11;
        String result5 = "";

        result5 =  (x %2 == 0 ) ? x + " is even" : x + " is odd ";

        System.out.println(result5);



    }



}
