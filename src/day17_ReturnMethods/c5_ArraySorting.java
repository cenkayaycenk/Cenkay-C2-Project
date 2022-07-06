package day17_ReturnMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c5_ArraySorting {
    public static void main(String[] args) {

        int [] numbers={5,19,2,-3,10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //classname.method
        int [] numbers2 = {3,10,5,7,20,100,0};
        descendingSort(numbers2);


    }

    //create a method that will print array in descending order
    public static void descendingSort( int [] arr){
        //first sort array
        //reverse the array with loop

        Arrays.sort(arr);

        int [] descendingArr=new int[arr.length];
        int LastIndex= arr.length-1;

        for (int i=0; i<descendingArr.length; i++){
            descendingArr[i]= arr[LastIndex];
            LastIndex--;
        }
        // descArr[0]=arr[lastIndex];
        // descArr[1]=arr[lastIndex-1];
        // descArr[2]=arr[lastIndex-2];
        // descArr[3]=arr[lastIndex-3];
        System.out.println(Arrays.toString(descendingArr));
    }



}
