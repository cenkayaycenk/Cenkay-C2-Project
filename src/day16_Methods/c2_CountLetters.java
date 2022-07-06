package day16_Methods;

import java.util.Arrays;

public class c2_CountLetters {

    public static void main(String[] args) {
        // create a java logic that will count letter a or A from given string
        //example
        //JavA
        //output should be 2


        //=====
        // we need
        //string
        //tochararray split
        //count variable int
        //for each


        String sentence = "Java is best , JavA is fun , Python is Also fun, Hello world";

        String [] letters= sentence.split("");


        int countLettersA=0;

        for (String eachLetter : letters){
            if (  eachLetter.equalsIgnoreCase("a")){
                countLettersA++;
            }
        }
        System.out.println("Count Of Letter A is " + countLettersA);












    }


}
