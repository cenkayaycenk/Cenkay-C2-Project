package day11_whileLoop;

public class c3_WhileLoop {
    public static void main(String[] args) {

        //structure of for loop

        for (int i = 0; i < 100; i++) {
            //starting point i=0    //initilazation
            //ending point i<100    //condition
            //iteration i++         //iteration
        }
        //while loop : while loop be keep runnimg as long as while condition is true
        // initilazition will be outside of while loop
        //while (100>95){//condition here
        //System.out.println("Hello World");//it will be infinitive loopwhile (100>95){//condition here

        int i = 0;

        while (i < 11) {
            System.out.println("Hello World " + i);
            i++;
        }

        int number1 = 5;
        while (number1 > 0) {//5 4 3 2 1
            System.out.println(number1);//5 4 3 2 1
            number1--;//4 3 2 1 0

        }
        int number2 = 5;
        while (number2 > 0) {//5 4 3 2 1
            number2--;//4 3 2 1 0
            System.out.println(number2);//4 3 2 1 0
        }





        }

    }







