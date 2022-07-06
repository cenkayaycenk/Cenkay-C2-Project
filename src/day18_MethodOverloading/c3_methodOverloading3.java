package day18_MethodOverloading;

public class c3_methodOverloading3 {




    public static class c3_methodOverloading1 {

        //tecnically we can overload main method
        //but to be able to run other main methods
        //we will need to call them in String [] main method

        public static void main(String[] args) {
            System.out.println("String Main");

            int [] numbers ={1,2,3,4};
            main(numbers);
        }
        public static void main(double [] args){
            System.out.println("Double main");
        }
        public static void main(int [] args){
            System.out.println("Int main");
        }


    }
}
