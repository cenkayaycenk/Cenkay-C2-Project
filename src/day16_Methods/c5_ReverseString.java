package day16_Methods;

public class c5_ReverseString {
    public static void main(String[] args) {
        reverseString("Cenkay");


        int i1=25;
        //reverseString(i1); we cant pass int here because parameter type of reverseString method is string

    }


    // we will create our own reverse library method
    // this method will accept a string
    // as a result it should be return reverse of the string

    public static void reverseString(String name){
        String result="";
        for (int i=name.length()-1 ;i>=0; i--){
            result += name.charAt(i);
        }
        System.out.println(result);
    }





}
