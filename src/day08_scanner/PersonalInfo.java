package day08_scanner;
import java.util.Scanner;
public class PersonalInfo {
    /*

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();
        System.out.println("Enter your last name: ");
        String lastName = input.next();

        input.nextLine();

        System.out.println("Please enter your address");
        String address = input.nextLine();


        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);

    }
}
