package day10_ForLoop;

public class c3_forLoop2 {

    public static void main(String[] args) {

        //starting point is 6
        //ending point is -1
        //iteration is -1
        for(int i=6 ; i> -2 ; i--){//6,5,4,3,2,1,0,-1
            System.out.println("Mert");//will be printed 8 times
        }



        // starting point is 0
        // ending point is 4
        //iteration -1
        //loop will be running until condition gets false
        //if condition always true then your loop will be infinitive loop
       // for (int i=0; i<5; i--){
        //    System.out.println("Meral");//0,-1,-2,-3 .......----always run//infinitive



        //create a condition that will print square numbers from 0-10
        // square of number means * number
        //output number0 0
        // number0 0
        // number1 1
        // number2 4
        // number3 9
        //....
        // number10 100

        // starting point is 0
        //ending point is 10
        //iteration +1

        for (int number=0; number<=10; number++){
            System.out.println("Number is " + number);
            System.out.println(" Square of number is  " + number*number);

        }











    }



}
