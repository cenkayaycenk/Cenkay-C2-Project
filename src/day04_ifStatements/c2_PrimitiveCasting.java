package day04_ifStatements;

public class c2_PrimitiveCasting {

    //we have 2 type of primitive casting
    //1.implicit casting (done automatically from java)
    //2.explicit casting (needs to be handled manually)

    //double > float > long > int > short > byte

    public static void main(String[] args){

        byte b1=20; // -128 to 127
        long l1=b1; // this is implicit casting (done will automatically by java)


        int i1=10;
        byte b2= (byte) i1;//explicit casting . This will be done by you manually.

        double d1=2.3;
        float f1= (float) d1;//explicit casting


        int i2=200;
        long l2=i2; //implicit casting


        short s=155;


    }

}