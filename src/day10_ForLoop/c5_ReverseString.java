package day10_ForLoop;

import java.util.Scanner;

public class c5_ReverseString {

    public static void main(String[] args) {

        // how can you reverse a string
        // input hello
        // output olleh

        String word= "Hello";
                    //01234

        String reverseWord= ""+ word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println(reverseWord);

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word ");
        String word2=input.nextLine();

        //since we dont know the word we need get last index of word to be able to reverse strong from last char
        System.out.println("Leght of your word " + word2.length());
        int lastIndex=word2.length()-1;

        String reverseWord2="";

        // starting point is lastindex
        //ending point will be 0
        // iteration is --1

        for (int i=lastIndex; i>=0; i--){
            System.out.println(word2.charAt(i));

            reverseWord2 += word2.charAt(i);
        }

        System.out.println(reverseWord2);




    }


}
