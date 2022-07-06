package day11_whileLoop;

public class c1_ContinueStatement {
    public static void main(String[] args) {

        //break will not stop loop
        //continue will only skip current iteration
        for (int i=0; i<5; i++){
            System.out.println("Before Break");//0 1 2

            if (i==2){
                break;//when java reaches here it will break the loop//2
               // System.out.println("After Break"); unreachable statement
            }

            System.out.println("After if");//0 1

        }

        for(int i=0; i<5; i++){
            System.out.println("Before continue" + i);//0 1 2 3 4

            if (i==2){
                continue;
            }


            System.out.println("After continue" + i);//0 1  3 4


        }

        //print only even numbers 1 - 10

        //first way you can just look for if(i%2==0)then print i number
        //second way you can skip the odd number by using continue statement

        for (int i=1; i<=10; i++ ){

            //System.out.println(i); if you print before checking if condition it will print everything
            if(i%2 !=0){// this will be true for odd numbers which I want to skip odd numbers and only print even numbers
                continue;//this will skip odd numbers such as 1-3-5-7-9
            }
            System.out.println(i);// we print here to make sure numbers has checked but by our if condition

        }
        System.out.println("*************");
        /// create a java logic that will not print numbers that are divisible both by 2 and 3 from 1 - 20
        //anything left should be printed
        //use continue statement


        //starting point 1
        //ending point 20
        for (int i=1; i<=20;i++){
            if (i%2==0 && i%3==0){//this means nembers are divisible by 2 and 3 at the same tine
                //which we dont want them printed
                //to skip them use continue
                continue;
            }
            System.out.print(i+ " , " );

        }

    }

}
