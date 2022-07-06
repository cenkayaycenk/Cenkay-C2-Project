package day11_whileLoop;

public class c6_SumEvenNumbers {

    /*Write a program using while loop, for loop that
     calculate the sum of the even numbers 0-30
     */

    public static void main(String[] args) {

        //starting point; ENDING POINT AND ITERATION

        // first use for loop
        int sum1=0;

        for (int i=0; i<=30; i++){

            if(i%2 ==0){//numbers are even
                System.out.println("adding this to sum " + i);
                sum1+=i;
            }
        }

        System.out.println(sum1);

        //with while loop
        System.out.println("*************");

        int start=0;
        int sum2=0;

        while (start<=30){

            if(start %2==0){
                System.out.println("Adding this number to sum2 " + start);
                sum2+=start;
            }
            start++;

        }
        System.out.println("Sum2 is " + sum2);

        //with continue

        System.out.println("**********");








    }

}
