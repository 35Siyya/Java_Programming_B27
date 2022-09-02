package day19_loops;

import java.util.Scanner;

public class Factorial {
    /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5*4*3*2*1 = 120
     */
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in); you can use scanner like bottom side to just example

        int num = new Scanner(System.in).nextInt();
        int factorial = 1;
        String msg = num + "! = ";

        for (int i = num; i > 1; i--) {
            factorial *= i;
            msg += i + " * ";
        }
        msg += " 1= " + factorial;
        System.out.println(factorial);
        System.out.println(msg);
    }
}
