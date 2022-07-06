package day06_NestedIf_Switch;

public class c4_switchStatement {

//create a java program that will take numbers between 1-12
    //and print months name depends on number
    //ex
    //1 -- jan
    //5 -- may

    public static void main(String[] args) {
        int number=12;
        String  monthName ;

        switch (number){//swtich will ask you to pass a variable that will might have different cases
            case 1 :monthName="Jan"; //swtich will check number and if it matches with the case = 1
                // it will make month name as a Jan
                break; //break will break all switch after catching the matching case number
            case 2 : monthName="Feb";
                break;
            case 3 : monthName="March";
                break;
            case 4 : monthName="Apr";
                break;
            case 5 : monthName="May";
                break;
            case 9 : monthName ="Sep";
                break;
            case 6 : monthName ="Jun";
                break;
            case 7 : monthName ="July";
                break;
            case 8 : monthName ="Aug";
                break;
            case 10 : monthName ="Oct";
                break;
            case 11 : monthName ="Now";
                break;
            case 12 : monthName ="Dec";
                break;
            default: monthName = " Invalid number entered Please check number";
                //break; optional to use because we dont have any case left

        }

        System.out.println(monthName);

        //3 casse with a b c
        //if the case is a result should be Hello a
        //if the case is b result should be Hello b
        //if the case is c result should be Hello c
        //if letter is something else then Hello Invalid.

        //result = "asdas"  this is how you reassigned the variable
        //if you want to add something to your variable and same time keep what you have
        //you will either do result = result + "a"; //hello a
        //or shortcut result += "a" ; //hello a


        char letter='c';
        String result = "Hello ";


        switch (letter){

            case 'a' :
                result += "a"; //result = result + "a";
                break;
            case 'b' :
                result += "b"; //result= hello b
                break;
            case 'c':
                result += "c"; //hello bc
                break;
            default:
                result += "Invalid";

        }
        System.out.println(result);

//in the switch first it will check matching case
//and then it will execute all lines after your case gets break

//to command everything choose all line in the class and then
//click on command + / for mac users
//click on ctrl + / for windows users

//to create a new project
//click on file  and click on new project

//to go previous step
//click on ctrl + z  or command + z



    }





}
