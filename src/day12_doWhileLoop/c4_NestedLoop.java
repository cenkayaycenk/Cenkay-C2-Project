package day12_doWhileLoop;

public class c4_NestedLoop {
    public static void main(String[] args) {

        //nested if :: if inside another if
        //nested loop:: loop inside another inside

        //example:
        //while inside for loop
        //for loop inside for loop
        //do while inside for
        // .....any loop can be inside of any loop

        for(int i=0; i<3; i++){//0 1 2 =====3 times Hello
            System.out.println("Hello");

            for(int j=1; j<5; j++){//1 2 3 4 ==== 4 times java
                System.out.println("Java");
            }
            // 3*4=12 times java
        }

        for(int i=1; i<4; i++){//1 2 3
            System.out.println("1.For Start");
            for(int k=3; k<6; k++){//3 4 5

                System.out.println("2. For " + " i is " + i + " k is " + k);

            }
            System.out.println("1.For End");
        }


    // print me following
        //3 row 5 columm
        //* * * * *
        //* * * * *
        //* * * * *

        for(int i=1; i<=3; i++){//this is first way
            System.out.println("* * * * *");
        }

        System.out.println("*************");

        // this is second way
        int totalrow=2;
        int totalcolumn=5;

        for (int i=1; i<=totalrow; i++){

            for(int j=1; j<=totalcolumn; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("*************");

        //this is third way
        for(int i=1; i<=totalrow; i++){

            int j=1;
            while (j <=totalcolumn){
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }




    }
}
