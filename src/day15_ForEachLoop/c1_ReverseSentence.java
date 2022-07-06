package day15_ForEachLoop;

import java.util.Arrays;

public class c1_ReverseSentence {
    public static void main(String[] args) {
        ////create a condition that will reverse given sentence
//        //ex: Java is fun
//        //output should be fun is java
////create a condition that will reverse given string
//        //ex: Java is fun
//        //output should be nuf si avaJ


        String sentence="Java is fun";
        // fun is Java

        String [] SplitedSentence=sentence.split(" ");//{Java, is, fun}
        System.out.println(Arrays.toString(SplitedSentence));

        String reverseSentence="";// store result from last index to first index

        for ( int i= SplitedSentence.length-1 ; i>=0 ; i--){

            reverseSentence += SplitedSentence[i] + " ";
            System.out.println("In The Loop " + reverseSentence);
        }

        System.out.println("------------------");

        System.out.println(reverseSentence);


        System.out.println("--------------------");

////create a condition that will reverse given string
//        //ex: Java is fun
//        //output should be nuf si avaJ

        String sentence2="Java is fun";
        String [] splitedsentence2=sentence2.split("");// we split each letter and store in to strong array

        String reversesentence2="";

        for ( int i= splitedsentence2.length -1; i>=0; i--){
            reversesentence2 += splitedsentence2[i];
        }

        System.out.println(reversesentence2);


    }
}
