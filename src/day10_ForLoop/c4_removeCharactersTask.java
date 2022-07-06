package day10_ForLoop;

import java.util.Scanner;

public class c4_removeCharactersTask {

    // Task: Create a java program that will check given string and
    // if string starts or ends with 'a' or 'A' remove it from string
    //if it is bot leave it as it is;
    // examples

    // if string is Hello output should be Hello
    //if string is Java output should be jav
    //if string is Ajavaa output should be jav
    //.....
    //Hint : Try with different cases to make sure your code is working
    //if you want to try with multiple words to you can create scanner and try multiple times with different words.

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter Your Word : ");
        String word=input.nextLine();

        int length = word.length();

        System.out.println("Length of plain word " + length);

        //first lets check first letter
        //is letter is small or capital remove it
        if (word.substring(0,1).equalsIgnoreCase("a")){
            word= word.substring(1);
            System.out.println("Word after first check " + word);
        }

        length=word.length();
        System.out.println("Length of word after first if check " + length);


        //to store last index number
        int lastIndexNumber=length - 1;

        if (word.substring(lastIndexNumber).equalsIgnoreCase("A")){
            word=word.substring(0,lastIndexNumber);
        }

        System.out.println("Modified word " + word);

        //first letter a
        //last letter a
        //first and last letter a
        //first and last letter are not a







    }



}
