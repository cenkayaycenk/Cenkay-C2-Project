package day09_StringMethods;

public class c1_StringMethods {

    //charAt()           Returns the character at the specified index (position)          char
    //indexOf()              Returns the position of the first found occurrence
    //                      of specified characters in a string                                int
    //isEmpty()              Checks whether a string is empty or not                          boolean
    //lastIndexOf()          Returns the position of the last found occurrence of
    //                      specified characters in a string                                   int


    public static void main(String[] args) {

        //1. you will create a scanner where you ask user how is the weather
        //2. you will need to store that in a string to check in the statement
        //3. you will create an if else block where you check weather
        //if weather is good you create another scanner where it ask user to put temperature
        //if weather is bad you don't ask for temperature

        String sentence="Hello world . Java is here llllo ";
                       //01234

        char ch=sentence.charAt(3);
        System.out.println(ch);// second l
        System.out.println(sentence.charAt(2));// first l


        //indexOf()              Returns the position of the first found occurrence
        //                      of specified characters in a string                                int

        System.out.println(sentence.indexOf("l"));// it will check first matching l from sentence and
        // return first l index number which is 2
        System.out.println(sentence.indexOf("ll"));// index 2---the beginning of ll is 2
        System.out.println(sentence.indexOf("lo"));//this is how you can get second l index number

                // to get index number from second lo

        System.out.println(sentence.indexOf("lllo") + 2);// ---30-----that gives index  number of second lo
        //or
            int IndexNumber= sentence.indexOf("lllo");// this index is 28
        System.out.println(IndexNumber + 2);// 28+2=30 ----

                // to get index of last e

        System.out.println(sentence.indexOf("e "));// that gives the index of last e ===25
        //or
        int LastIndex= sentence.indexOf("er") + 2;
        System.out.println(LastIndex);// that also gives 25
        //or
        System.out.println(sentence.indexOf("er") + 2);// that also gives 25


        //lastIndexOf()          Returns the position of the last found occurrence of
        //                      specified characters in a string                                   int

        String sentence2="Hello world . Java is here llllo ";

        System.out.println("**************");


              // to get last l index
        System.out.println(sentence.lastIndexOf("l"));

                // to get first l
        int indexFistl=sentence2.indexOf("l");
        int indexLastl= sentence2.lastIndexOf("l");
        int indexSecondl= sentence2.indexOf("lo");
        int indexBeforeLastl= sentence2.lastIndexOf("llo");

                //to print first and last l

        System.out.println(indexFistl + "," + indexLastl);

                // to print second and before last l
        System.out.println(indexSecondl + "," + indexBeforeLastl);












    }



}
