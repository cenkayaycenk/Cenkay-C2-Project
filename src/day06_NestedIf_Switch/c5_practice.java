package day06_NestedIf_Switch;

public class c5_practice {

    //task 1: create a java program that will check if number is divisible by 2 and 5 same time


    public static void main(String[] args) {

        int number = 20;

        String result = "";

        if (number %2==0 && number %5==0){
            result = number + " is divisible by 2 and 5";
        }else {
            result = number + " is not divisible by 2 and 5";
        }

        System.out.println(result);

        //// or with ternary

        result = (((number % 2) == 0) && ((number % 5) == 0)) ? (number + " is divisible by 2 and 5 ") : (number + " is not divisible by 2 and 5");

        System.out.println(result);


        /////////////----------

//task 2: write  java program to find the largest among three numbers. 1) Using if-else..if
        int x=10;
        int y=40;
        int z=25;

        String largest= "";

        if (x>y && x>z){
            largest= x + " is the largest number";
        }else if (y>z && y>z){
            largest = y + " is the largest number";
        }else {
            largest= z + " is the largest number";
        }
        System.out.println(largest);


        ////////-------------
//task 3: create Program to check whether the given number is positive or negative

        int a= 9;

        String end = "";

        if (a>0){
            end= a + " is a positive number";
        }else if (a<0){
            end= a+ " is an negative number";
        }else {
            end= a + " is neither negative nor positive";
        }

        System.out.println(end);


        //////---------


        int price = 20;
        int quantity = 30;
        int revenue= (price) * (quantity);
        double netrevenue = (revenue) * (0.90);
        double discount = revenue * (0.10);

        if (revenue<5000){
            System.out.println(revenue + " is the revenue / No discount");
        }else if(revenue>5000) {
            System.out.println(netrevenue + " is the revenue " + discount + " is the discount");
        }else {
            System.out.println("Invalid input");
        }


///////-----------

        //Write a program that prompts the user to enter grade.
// Your program should display the corresponding meaning of grade as per the following table
//
//Grade    Meaning
//A        Excellent
//
//B        Good
//
//C        Average
//
//D        Deficient
//
//F        Failing


        char grade= 'B';
        String means= "Excellent";

        String result1="";

        if (grade=='A'){
            means="Excellent";
        }else if(grade=='B'){
            means="Good";
        }else if(grade=='C'){
            means="Average";
        }else if(grade=='D'){
            means="Deficient";
        }else if (grade=='F'){
            means="Failing";
        }else {
            means="Invalid input";
        }

        result1 = "Grade " + grade + " is " + means;

        System.out.println(result1);

        // with Ternary

        String means2 = (grade=='A') ? "Excellent "
                : (grade=='B') ? "Grade " + grade + " is Good"
                : (grade=='C') ? "Grade " + grade + " is Average"
                : (grade=='D') ? "Grade " + grade + " is Deficient"
                : (grade=='F') ? "Grade " + grade + " is Failing"
                : "Invalid Input";

        System.out.println(means2);


//Positive, negative or zero
//Write a program that prompts the user to input a number.
// The program should then output the number and a message saying whether
// the number is positive, negative, or zero.

        int number10 = 8;
        String answer = "";

        if (number10<0) {
            answer = number10 + " is a negative number";
        }else if (number10>0){
            answer = number10 + " is a positive number";
        }else{
            answer = number10 + " is zero";
        }

        System.out.println(answer);

        String answer1 = (number10<0) ? number10 + " is a negative number"
                : (number10>0) ? number10 + " is a positive number"
                : number10 + " is zero";

        System.out.println(answer1);

//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for next 50 calls.
//Plus Rs. 0.50 per call for next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.

    int calls = 300;
    double rs = 0.50;
    double bill = 200;

    if (calls >0 && calls <=100){
        bill = 200;
    }else if (calls>100 && calls<=150){
        bill = 200 + (50*0.60);
    }else if (calls >150 && calls <=200){
        bill = 200 + (50*0.50);
    }else if (calls >200){
        bill = 200 + ((calls - 200) * 0.40);
    }

        System.out.println(bill);

//Grade Calculator
//The marks obtained by a student in 3 different subjects are input by the user.
// Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//Average
//Grade
//
//90-100  A
//80-89   B
//70-79   C
//60-69   D
//0-59    F

        int ax = 75;
        char bx = 'A';

        String dx = (ax>=90 && ax<=100) ? " Grade is A "
                : (ax<90 && ax>=80) ? " Grade is B "
                : (ax<80 && ax>=70) ? " Grade is C"
                : (ax<70 && ax>=60) ? " Grade is D"
                : (ax<60 && ax>=0) ? " Grade is F"
                : "Invalid input";

        System.out.println(dx);

//Descending Order Names
//Write a program that prompts the user to enter three names.
// Your program should display the names in descending order.








    }














}
