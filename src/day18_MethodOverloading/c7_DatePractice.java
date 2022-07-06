package day18_MethodOverloading;

import java.time.LocalDate;

public class c7_DatePractice {

//create e method that will check today date and compare the date
    //you are passing
    //if it matches print Happy Birthday
    //if it is not "Not today I am Sorry"


    public static void happyBirthday(int year, int month, int day) {
        LocalDate birthday=LocalDate.of(year,month,day);
        LocalDate todayDate=LocalDate.now();

        int month2=todayDate.getMonthValue();
        int day2=todayDate.getDayOfMonth();

        if(month==month2 && day==day2){
            System.out.println("Today is your Birthday");
            System.out.println("Happy birthday to you");
        }else {
            System.out.println("Not today I am sorry");
        }

    }

    public static void main(String[] args) {
        happyBirthday(2022,7,5);

    }












}
