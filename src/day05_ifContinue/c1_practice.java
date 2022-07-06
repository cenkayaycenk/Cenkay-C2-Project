package day05_ifContinue;

public class c1_practice {

    public static void main(String[] args){

      int i1= 20;
      int i2= -i1++ + i1 - ++i1;

      // i2 = -(20) it is post condition it will be 21 in next step

        //-(20) + 21 - (22) >>>>> result is +21

       System.out.println(i2);


       // check i2 number if it is positive print is positive
        // if it is negative print negative

    if (i2 > 0){
        System.out.println(i2 + " is Positive");
    }
    if (i2 < 0){
        System.out.println(i2 + " is Negative ");
    }


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
