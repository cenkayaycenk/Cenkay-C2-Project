package JavaHomework;

public class Work {

    public static void main(String[] args) {

        //Task 1 : String Methods
//Sentence =hello my name is hello worlD.
// i am 25 years old. i am living in new yorK .
// i have been in the IT industry for about 6 years.
// i starteD as a manUal tesTer and now doing AutOMation for about 4 years.
// i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates.
// my main lanGuage is JAVA. i designed and deveLoped many automation test scripts by using BDD framework


//first create one string and copy pass above paragraf.
//then create multiple strings to store each sentence that you see in the paragraf.
//Do below modification for your sentences :
//make sure each sentence first letter capital .
//make sure city names start with capital .
//rest needs to be small cases.
//make sure to change name,age and city information with your personal information
//make sure to trim your sentences
//after those modifications
//print each sentence length , last index number
//print first,last and fifth character from each sentence.

        String paragraph = "hello my name is hello worlD." + //26-28
                "        i am 25 years old." +
                " i am living in new yorK ." +
                "   i have been in the IT industry for about 6 years." +
                "  i starteD as a manUal tesTer and now doing AutOMation for about 4 years." +
                " i have experience in different DOmains: education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates." +
                "my main lanGuage is JAVA. i designed and deveLoped many automation test scripts by using BDD framework";

        String sentence1 = "hello my name is hello worlD.";
        String sentence2 = "        i am 25 years old.";
        String sentence3 = " i am living in new yorK. ";
        String sentence4 = "   i have been in the IT industry for about 6 years.";
        String sentence5 = "  i starteD as a manUal tesTer and now doing AutOMation for about 4 years.";
        String sentence6 = " i have experience in different DOmains: education, Energy, finance.";
        String sentence7 = "i have Scrum Master and Oracle Java Programmer certificates.";
        String sentence8 = "my main lanGuage is JAVA.";
        String sentence9 = " i designed and deveLoped many automation test scripts by using BDD framework.";

        System.out.println(sentence1.length());
        String cap = sentence1.substring(0,1).toUpperCase().concat(sentence1.substring(1,29).toLowerCase());
        cap = cap.replace("hello world","Bawer Sulhan");
        System.out.println(cap);


        System.out.println("*************************");

        String trim1 = sentence2.trim();
        String newsentence2 = trim1;
        System.out.println(newsentence2.length());
        String cap1 = newsentence2.substring(0,1).toUpperCase().concat(newsentence2.substring(1,18).toLowerCase());
        cap1 = cap1.replaceAll("25","27");
        System.out.println(cap1);

        System.out.println("****************************");

        String trim2 = sentence3.trim();
        String newsentence3 = trim2;
        System.out.println(newsentence3.length());
        String cap2 = newsentence3.substring(0,1).toUpperCase().concat(newsentence3.substring(1,14).toLowerCase()
                .concat(newsentence3.substring(14,16).toUpperCase().concat(newsentence3.substring(16,24).toLowerCase())));
        System.out.println(cap2);

        System.out.println("*********************************");

        String trim3 = sentence4.trim();
        String newsentence4 = trim3;
        System.out.println(newsentence4.length());
        String cap3 = newsentence4.substring(0,1).toUpperCase().concat(newsentence4.substring(1));
        System.out.println(cap3);

        System.out.println("**********************************");

        String trim4 = sentence5.trim();
        String newsentence5 = trim4;
        System.out.println(newsentence5.length());
        String cap4 = newsentence5.substring(0,1).toUpperCase().concat(newsentence5.substring(1,72).toLowerCase());
        System.out.println(cap4);

        System.out.println("************************************");

        String trim5 = sentence6.trim();
        String newsentence6 = trim5;
        System.out.println(newsentence6.length());
        String cap5 = newsentence6.substring(0,1).toUpperCase().concat(newsentence6.substring(1,67).toLowerCase());
        System.out.println(cap5);

        System.out.println("*************************************");

        System.out.println(sentence7.length());
        String cap6 = sentence7.substring(0,1).toUpperCase().concat(sentence7.substring(1));
        System.out.println(cap6);

        System.out.println("**************************************");

        System.out.println(sentence8.indexOf("."));
        String cap7 = sentence8.substring(0,1).toUpperCase().concat(sentence8.substring(1,20).toLowerCase()
                .concat(sentence8.substring(20,21).toUpperCase().concat(sentence8.substring(21,25).toLowerCase())));
        System.out.println(cap7);

        System.out.println("***************************************");

        String trim6 = sentence9.trim();
        String newsentence7 = trim6;
        System.out.println(newsentence7.indexOf("B"));
        System.out.println(newsentence7.length());
        String cap8 = newsentence7.substring(0,1).toUpperCase().concat(newsentence7.substring(1,77).toLowerCase());
        String cap9 =(cap8.replace("bdd","BDD"));
        System.out.println(cap9);


        System.out.println(cap1.concat(" ").concat(cap2).concat(" ").concat(cap3).concat("\n".concat(cap4).concat(" ")
                .concat(cap5).concat("\n").concat(cap6).concat(" ").concat(cap7).concat("\n").concat(cap9)));
    }

}
