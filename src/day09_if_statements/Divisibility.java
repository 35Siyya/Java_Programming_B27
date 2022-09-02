package day09_if_statements;

public class Divisibility {

    public static void main(String[] args) {


        int n = 7;

        if (n % 2 == 0) {// if the remainder equal to 0
            System.out.println(n + " is divisibility by 2");

        }
        if (n % 3 == 0){// if the remainder equal to 0
        System.out.println(n +" is divisibility by 3");
       }

        if (n % 5 == 0) {// if the remainder equal to 0
            System.out.println(n + " is divisibility by 5");
        }
    }
}
