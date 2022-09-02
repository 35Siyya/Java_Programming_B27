package day14_String;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password:");
       // String pass = "WoodenSpoon";
      //  System.out.println(pass.equals("WoodenSpoon"));
        if( scan.nextLine().equals("WoodenSpoon")){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
