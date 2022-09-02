 package day07_Scanner;
 import java.util.Scanner;
 public class Angles {
    /*
    Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and determine if the angles make a circle, which means the angles add to 360.0
    */
    static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {

         System.out.println("Enter three numbers: ");
         float angle1 = input.nextFloat();
         float angle2 = input.nextFloat();
         float angle3 = input.nextFloat();

         float sum = angle1 + angle2 + angle3;
         boolean isTriangle = ( sum == 180);
         boolean isCircle = (sum == 360);

         System.out.println("Sum of angles = " + sum + "\t|\tIs this Triangle? " + isTriangle);
         System.out.println("Sum of angles = " + sum + "\t|\tIs this Circle? " + isCircle);


     }

}
