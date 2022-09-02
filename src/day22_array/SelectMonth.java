package day22_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        /*
        Ask the user to type a number

        number is for the month
        print the month
        >1
        January

        >12
        December
         */
       Scanner input = new Scanner(System.in);


        String [] months = {"January", "February", "March", "April", "May", "June", "July",
                             "August", "September", "October", "November", "December"};

        System.out.println("Enter the month number");
        int num = input.nextInt();

        if (num >= 1 && num<=12){//valid months from 1-12
            System.out.println(months[num-1]);//hangi numberi girersen -1 istedigin icin bir onceki ayi yazdiricak.7 yazarsan 6. ayi vericek cunku num-1'i cekmek istedin array'den
        }else{
            System.out.println("Invalid month number.Should be 1-12");//cikarma islemi yapicak 12 yazarsan 11. ayi yazdirir substraction yapicak
        }




    }
}
