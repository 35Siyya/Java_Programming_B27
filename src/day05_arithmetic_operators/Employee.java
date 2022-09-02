package day05_arithmetic_operators;

public class Employee {

    public static void main(String[] args) {

        String firstName = "Ella";
        String lastName = "Kasaburi";
        String companyName = "MI6";
        String jobTitle = "Secret Agent";
        char suit = 'E';
        int employeeId = 7;
        int numberOfPTO = 15;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + employeeId  +'@' + companyName + ".com";
        String benefits = "$" + salary + " salary a year, " + numberOfPTO + " PTO days and WFH";

        String summary = "Employee Information for " + fullName + "\n" +jobTitle + " for " + companyName +
                ", based in suite "  + suit + "\nMr/Mrs " + lastName + "is full time" + isFullTime +
                "\nCurrent benefits include " + benefits;

        System.out.println(summary);

    }
}
