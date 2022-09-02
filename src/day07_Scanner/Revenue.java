package day07_Scanner;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a price and quantity and then calculate the revenue.
         revenue = price × quantity.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a price:");
        int price = input.nextInt();

        System.out.println("Enter a quantity:");
        int quantity = input.nextInt();

        int revenue = price * quantity;
        System.out.println("The revenue is" + revenue);


    }
}
