package day15_ForEachLoop;

import java.util.Arrays;

public class c3_ArrayDeepToString {
    public static void main(String[] args) {

        int [] number={1,2,3};
        System.out.println(Arrays.toString(number));

        //2D
        int [] [] number2D={  {1,2},{2,3,4},{4}  };
        System.out.println(Arrays.toString(number2D));// it gives error
        System.out.println(Arrays.toString(number2D[0]));//it gives 1. container
        System.out.println(Arrays.deepToString(number2D));// [1,2], [2,3,4] , [4]


    }
}
