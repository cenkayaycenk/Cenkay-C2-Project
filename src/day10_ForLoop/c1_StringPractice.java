package day10_ForLoop;

public class c1_StringPractice {

    public static void main(String[] args) {

        //How do you split a sentence based in specific character?

        String sentence="Hello java is  planet ,java is beautiful java is best ";


        //to split from second java
        int IndexOfPlanet= sentence.indexOf("java is b");
        String splitedSentence=sentence.substring(IndexOfPlanet);
        System.out.println(splitedSentence);

        System.out.println(sentence.length());//54
        //length is equal = last index + 1
        System.out.println(sentence.lastIndexOf(" "));//53 last index number




    }


}
