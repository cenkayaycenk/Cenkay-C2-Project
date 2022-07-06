package day12_doWhileLoop;

public class c5_Triangles {
    public static void main(String[] args) {

        /*
        *
        **
        ***
        ......
         */

        for (int i=1; i<5; i++){
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");

        /*
        * * * * * * *
        * * * * * *
        * * * * *
        * * * *
        ....

         */

        int size=7;
        for(int i=1; i<=size; i++){
            for(int j=size; j>=1; j--){
                if (j>=i)
                    System.out.print("* ");
            }
            System.out.println();
        }




    }



}
