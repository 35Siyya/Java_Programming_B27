package day08_scanner;
import java.awt.*;
import java.util.Scanner;

public class EmployeeReport {
    public static void main(String[] args) {
        /*
        full name
        job title
        salary
        company hq
        full name
        Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52) */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname = input.nextLine();

        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("What is your hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the avarage number of hours in a week ");
        int hours = input.nextInt();
        double salary = hours * 52 * hourlyRate ;

        System.out.println("Where is the company HQ");
        input.nextLine();// empty one for the catch the enter input
        String hqLocation = input.nextLine();

        System.out.println("Are you full: true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullname + " is a " + jobTitle + " they make " + salary + " because they are fulltime: " + isFullTime + ". " +
                "The HQ is located in: " + hqLocation;
        System.out.println(report);


    }
}
