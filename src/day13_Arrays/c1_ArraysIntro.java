package day13_Arrays;

public class c1_ArraysIntro {
    public static void main(String[] args) {
        //int. double, float
        //each variable has own value
        //if we want to store multiple values in one list

        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        //...
        //arrays :containers for multiple variables
        // as a container that will store multiple values inside
        //and it has ready methods where you can modify your variables


        //declaration of arrays
        //Datatype [] nameofcontainer = {data1,data2,data3}

        //container for numbers

        // int container
        int[] numbers = {100, 2, 5, 955, 10, 25, 3, 7, 9};// this is int array
        //you can store any other data type inside here
        // array has index numbers
        //0 1   2  3   4  5   6  7 8

        //PRINT THIRD number, (index2)
        System.out.println(numbers[2]);

        //print first number (index0)
        int firstnumber=numbers[0];
        System.out.println(firstnumber);

        



    }

}