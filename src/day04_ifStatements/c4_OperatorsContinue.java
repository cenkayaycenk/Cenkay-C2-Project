package day04_ifStatements;

public class c4_OperatorsContinue {

    public static void main (String [] args){

        int x= 125;
        System.out.println(x);

    // if you want to reassign your variable you should call by variable name
        x=100;
        System.out.println(x); // x is now 100

        x = x+10; //x is 100+10=110
        x = x+20; // x is 110+20=130
        x = x+40; // x is 130+40=170

        System.out.println(x);

        x += 20; // it is the same thing with x = x+20
        System.out.println(x); // 170+20=190

        int y=20;
        y =y+20; // y is 40
        y +=20; // y is 60
        y *=2; // y is 120

        System.out.println(y);

        x= -y;
        System.out.println(x); // y is 120>>>>so x is -120

        x -= y; // x= x-y>>> -120-120 = -240
        System.out.println(x); // -240

        System.out.println("***********************");


        int z=10;
        int w=20;

        z = w - z + 10 + --z; // 20-10+10+9=29 >>>> (--z) means 20-1

        System.out.println(z); //result will be 29


        z -= z+z-z+20;

        // (-=) means    z = z - ( z+z-z+20) >>>>>>important ******
        //                 z= z-z-z+z-20
        //                  z= - 20

        System.out.println(z);



        int number=20;

        number *= 2 ; // means number = number * 2
        System.out.println(number); // new number is 40

        number /= 2; // means number = number / 2
        System.out.println(number); // new number is 40/2=20





    }
}
