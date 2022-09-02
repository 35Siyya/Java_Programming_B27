package day04_variables;

public class Employee {
    /*
    create a class Employee create a main method
    declare and assign these variables with the most appropriate datatypes:
    - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time
    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
    Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.
    */
    public static void main(String[] args) {

        String firstName = "Seyhan";
        String lastName = "Kasaburi";
        String companyName = "Cisco";
        String email = "seyhank@cisco.com";
        String jobTitle = "SDET";
        char suit = '6';
        short employeeId = 12934;
        int numberOfPto = 20;
        String salary = " $140000";
        boolean isRemote = true;
        boolean isFullTime = true;

        System.out.print("\tNew Employee Information:\n");
        System.out.println("Full Name = " + firstName + " " + lastName + "\nEmail =" + email);
        System.out.println("CompanyName = " + companyName + "\nJob title =" + jobTitle);
        System.out.println("suit = " + suit + "\nEmployee ID =" + employeeId);
        System.out.println("NumberOfPto = " + numberOfPto +"\nSalary =" + salary);
        System.out.println("Remote = " + isRemote + "\nFull Time = " + isFullTime);


    }
}