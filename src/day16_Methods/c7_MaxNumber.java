package day16_Methods;

public class c7_MaxNumber {

    ///create a method that will accept 2 different number
    //and  it will print me the maximum one

    public static void maxNumber( int number1, int number2){
        if (number1 > number2){
            System.out.println(number1 + " is bigger then " + number2);
        } else if (number1 < number2) {// number 2 is max
            System.out.println(number2 + " is bigger then " + number1);
        }else {
            System.out.println(number1 + "is equal to " + number2);
        }
    }

    public static void main(String[] args) {

        maxNumber(5,10);
        maxNumber(100,555);

        //2 number compare
        int num1=150;
        int num2=250;
        maxNumber(num1,num2);




    }





}
