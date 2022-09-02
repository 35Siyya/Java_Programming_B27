  package day07_Scanner;
  import java.util.Scanner;
  public class Numbers {
         public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          /*
          Create a program that will ask the user to enter two numbers. Add the numbers and print the result

           */
             System.out.println("Please enter a number:" );
             int number = input.nextInt();
             System.out.println("Enter the second number:");
             int number2 = input.nextInt();
             System.out.println("This is your number: " + (number + number2));



      }

}
