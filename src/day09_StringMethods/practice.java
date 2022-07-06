package day09_StringMethods;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {


        //create a logic that will check login function of facebook.
        //correct username = renastech
        //correct password = renastech123

        //use scanner here to pass usernames and passwords
        //do validation of those usernames and password matching with correct credentials


        Scanner Input= new Scanner(System.in);

        System.out.println("Enter your Username : ");
        String UserName= Input.nextLine();

        System.out.println("Enter your Password : ");
        String password = Input.nextLine();


        if (UserName=="renastech" ){
            System.out.println("Login Succesfull");

        }else if (password=="renastech123"){
            System.out.println();

        } else{
            System.out.println("Login failed");
        }





    }






}
