package day18_loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120

         */
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int totalMultiplied=1;
        while(number>=1){
            totalMultiplied  *= number;
            number--;

        }
        System.out.println(totalMultiplied);

    }
}
