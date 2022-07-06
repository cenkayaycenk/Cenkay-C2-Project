package day11_whileLoop;

public class c2_JavaPractice {
    public static void main(String[] args) {

        //write a java program that will check numbers 1-50
            //if number is divisible by 2 print JA
            //If number divisible by 3 print VA
            //if number is divisible both 2 and 3 JAVA
            //if it is not divisible by 2 or 3 print number itself



        //starting point 1
        //ending point 50
        //iteration ==

        String result="";

        for(int i=1; i<=50; i++) {
            if (i%2==0 && i%3==0){
                result +="JAVA ";
            }else if (i%3==0){
                result+="VA ";
            }else if(i%2==0){
                result+="JA ";
            }else{
                result+= i + " ";
            }

        }
        System.out.println(result);






    }

}
