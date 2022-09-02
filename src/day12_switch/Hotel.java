package day12_switch;
import java.util.Scanner;
public class Hotel {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("How many days they will stay at the hotel?");
            int daysStaying = input.nextInt();
            System.out.println("How many people will be staying?");
            int partySize = input.nextInt();
            String roomType = " ";
            int price = 0;

            switch(partySize){
                case 1:
                    roomType = "single room";
                    price = daysStaying*100;
                    break;
                case 2:
                    roomType = "double room";
                    price = daysStaying * 125;
                    break;
                case 3:
                case 4:
                    roomType = "large room";
                    price = daysStaying * partySize * 125;
                    break;
                case 5:
                case 6:
                case 7:
                    roomType = "suite";
                    price = daysStaying * 5000;
                    break;
                default:
                    System.out.println("Sorry we don't have any available rooms for that size party");
            }
            if (partySize >0 && partySize <= 7) {
                System.out.println("Hotel information : \n" + "party size: " + partySize + "\nroom type: " + roomType + "\nprice: " + price);
            }

        }
    }

