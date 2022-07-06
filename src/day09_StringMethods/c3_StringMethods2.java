package day09_StringMethods;

public class c3_StringMethods2 {

    //isEmpty()              Checks whether a string is empty or not                          boolean
    //length()           Returns the length of a specified string                         int
    //replace()              Searches a string for a specified value, and returns
    //                      a new string where the specified values are replaced               String
    //replaceFirst()         Replaces the first occurrence of a substring that matches the
    //                      given regular expression with the given replacement                String
    //
    //startsWith()       Checks whether a string starts with specified characters         boolean
    //substring()            Extracts the characters from a string,
    //                      beginning at a specified start position,
    //                      and through the specified number of character                      String
    //toLowerCase()          Converts a string to lower case letters                          String
    //toUpperCase()          Converts a string to upper case letters                          String
    //trim()                 Removes whitespace from both ends of a string                        String

    public static void main(String[] args) {
        //isEmpty()              Checks whether a string is empty or not                          boolean

        String word="azmar";
        System.out.println(word.isEmpty());//false

        String word2="";

        boolean b1= word2.isEmpty();//true

        String word3= " ";
        boolean b2= word3.isEmpty();

        System.out.println(b1);// true
        System.out.println(b2);// false------there is a space in word3

        //length()           Returns the length of a specified string                         int

        String name="recep";
                   //01234

        System.out.println("Name Length :" + name.length()); //5


        //to get last index number ----way 1
        int lastIndex=name.lastIndexOf("p");
        System.out.println("Last Index of name " + lastIndex); //4

        System.out.println(name.charAt(4));// p

        //to get last index number ---- way 2
        int lastIndex2=name.length() - 1;
        System.out.println(lastIndex2);//4






    }


}
