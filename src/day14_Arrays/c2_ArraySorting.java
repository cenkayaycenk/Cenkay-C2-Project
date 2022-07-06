package day14_Arrays;

import java.util.Arrays;

public class c2_ArraySorting {

    public static void main(String[] args) {

        int [] numberList= {2,3,10,-55,209,9,11,100,220};
        System.out.println(Arrays.toString(numberList));//[2, 3, 10, -55, 209, 9, 11, 100]

        Arrays.sort(numberList);
        System.out.println(Arrays.toString(numberList));//[-55, 2, 3, 9, 10, 11, 100, 209,220]

        //print the min number
        //after sorting your min number will be always first index number
        System.out.println("Min number is " + numberList[0]);

        //print the max number
        //will be last index number since we sorted
        // which is length -1
        System.out.println("Max number is " + numberList[numberList.length-1]);

        //medium number
        //first you will need to check if number is divided by 2
        System.out.println("Medium number is " + numberList[numberList.length /2 ]);//5th int,,,so 4th index

        //largest to smallest
        //create a condition that will print thr number from largest to smallest

        int [] arr={100,2,5,16,27};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //if i also want to store from large to small
        int [] largeToSmall=new int[arr.length];// [0 ,0 , 0 , 0 , 0]

        //largeToSmall[0] == arr [lastindex]
        //largeToSmall[1] == arr [lastindex-1]
        //..

        //to print from largest
        //my loop will need to start from last index
        //end point = 0 first index
        //iteration --

        int j=0;
        for (int i = arr.length-1 ; i >= 0 ; i-- ){ //last last -1

            //System.out.println(arr[i]);
            System.out.println(j +" j"    + " ,, i "+i);
            largeToSmall[j] = arr[i];
            //largeToSmall[0] == arr [lastindex]
            //largeToSmall[1] == arr [lastindex-1]
            //..
            j++;//1
        }

        System.out.println(Arrays.toString(largeToSmall));



        }







    }

