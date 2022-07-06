package test;

import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {

//Write a Java program to find the second largest element in an array.

       // {1551,65656,25,3654,12,}

        int [] numbers= {551,65656,25,3654,12};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int secondLarge=0;

        secondLarge=numbers[numbers.length -2];
        System.out.println("Second largest number is " +secondLarge);

        System.out.println("Second smallest number is " + numbers[1]);

        int sum=0;

        for(int i : numbers)
            sum=+i;
        System.out.println("Sum of numbers is " + sum);

        //FIND INDEX NUMBER OF AN ELEMENT

        int element=0;
        int index=0;

        for( int i=0; i<numbers.length; i++){
            if (numbers[i] == element){
                index=i;
                break;
            }
        }
        System.out.println("Index number of 3654 is " + index);



















    }
}
