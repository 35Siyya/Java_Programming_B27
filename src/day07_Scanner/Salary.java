package day07_Scanner;
import java.util.Scanner;
/*
  Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52) */
    public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        double salary = input.nextDouble();
        System.out.println();
        System.out.println("Enter your Weekly hours:");
        int hoursWeekly = input.nextInt();
        double hourlyRate = salary / (hoursWeekly * 52);

        System.out.println("Your hourly rate is: " + hourlyRate);
    }
}
