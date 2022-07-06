package day12_doWhileLoop;

public class c1_doWhileLoop {

    public static void main(String[] args) {

        //for loop
        //while loop
            //it will run as long as your condition is true
            //it will stop running when your condition turns to false
        //do while loop
            //it will run once at the beginning no matter your while condition is true or false
            //it will continue to run if while is true

        int number =10;
        while (number<10){//this condition is false it wont print anything
            System.out.println("While Loop");
        }


        do {//will run at least one time no matter condition is true or false
            System.out.println("Do while loop");
        }while (number<10);



        // infinitive do while
    //        do{
    //            System.out.println("hello");
    //        }while (number<10);

        System.out.println("*************");

        int number2=2;

        do {
            System.out.println("Number 2 is " + number2);
            number2++;
        }while (number2<10);

        System.out.println("**************");

        int number3=3;
        do {
            System.out.println(number3);// only this is true ====3 printed
            number3--;
        }while (number3<0);//this is false

        System.out.println("*********");

        //print even numbers from 1-100

        int number4=0; // starting point

        do {
            if(number4 %2==0){
                System.out.print(number4 + " , ");
            }
            number4++;
        }while (number4<=100);//condition end point


        }
    }



