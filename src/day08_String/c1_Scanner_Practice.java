package day08_String;

import java.util.Scanner;

public class c1_Scanner_Practice {

    public static void main(String[] args) {

        //to be able to use library we will need to create an object from class
        Scanner input= new Scanner(System.in);

        System.out.println("Employee First Name ");
        String fisrtName= input.next(); // next will only accept one word
        System.out.println("Employee first name is : " + fisrtName);

        //to handle enter that comes after next use below line
        input.nextLine();// next line also means "Enter"

        System.out.println("Employee Full Name ");
        String fullname= input.nextLine(); // accept enter
        System.out.println("Employee Full name is :" + fullname);

        // you dont need to use imput.nextline again because we  use it above

        System.out.println("Employee Age ");
        int age= input.nextInt();
        System.out.println("Employee Age is : " + age);

        input.nextLine();

        System.out.println("Employee Company Name ");
        String companyname= input.nextLine(); // accept enter
        System.out.println("Employee Company Name is :" + companyname);

        // you dont need to use imput.nextline again because we  use it above

        System.out.println("Employee City ");
        String city= input.nextLine();
        System.out.println("Employee City is : " + city);

        System.out.println("Employee Salary ");
        double salary= input.nextDouble();
        System.out.println("Employee Salary is :" + salary);








    }




}
