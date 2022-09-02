package day12_switch;
  import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a Name of a Month");
        String month = scan.next();

        switch (month) {
            case "February":
                System.out.println(month + " has 28 day");
                break;
            case "April":

            case "June":
            case "September":
            case "November":
                System.out.println(month + " has 30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println(month + " has 31 days");
                break;
            default:
                System.out.println("Invalid Floor Selected");
        }
    }}