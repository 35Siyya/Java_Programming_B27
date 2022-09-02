package day12_switch;

import java.util.Scanner;

public class ExtraSpace {
    public static void main(String[] args) {

        /**
         * Use scanner to read a String from the console
         * Remove extra spaces in the beginning or end
         * Print in all lowercase
         * Print the number of characters
         */

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter random word:");
            String extra = input.nextLine();

           // int len = extra.length();
           // System.out.println("Before Trimming= " + len);

            extra = extra.trim();
            System.out.println(extra);

            extra = extra.toLowerCase();
            System.out.println(extra);

           int len2 = extra.length();
            System.out.println("After Trimming= " + len2);

        System.out.println("--------------------------------------------");

        int number =10;
        /*
        number smaller than 0 print invalid
        number between 1 and 3 print good
        number between 4 and 8 print better
        more than 8 print best
         */

        if (number >=8) {
            System.out.println("best");
        }
        else if (number>=4){
            System.out.println("better");
        }else if (number>=1){
            System.out.println("good");
        }else {
            System.out.println("invalid");
        }

        }


}
