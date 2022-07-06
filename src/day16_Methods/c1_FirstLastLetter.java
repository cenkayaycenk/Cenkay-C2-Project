package day16_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class c1_FirstLastLetter {
    public static void main(String[] args) {

//create a java program that will ask for 5 string  name to store in the array
        //and print first and last letter from each string

        //example
        //input : berkan , firas ,merve ..
        //output : bn , fs ,me


// ------- we need to use
        // Scanner
        // String
        // Loop
        // Char at

        Scanner input= new Scanner(System.in);

        // to store 5 names
        String [] nameList= new String[5];

        // nameList [0=input.next](); we need 5 times

        for (int i=0 ; i<nameList.length; i++) {
            System.out.println("Enter Name " + (i+1));
            nameList[i]=input.next();
        }
        System.out.println(Arrays.toString(nameList));

        String firstAndLastLetter="";

        for (String eachName: nameList){

            firstAndLastLetter="" + eachName.charAt(0) + eachName.charAt(eachName.length()-1);
            System.out.println(firstAndLastLetter);
        }



    }
}
