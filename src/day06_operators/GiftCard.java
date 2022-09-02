package day06_operators;

   public class GiftCard {
    /* declare and assign a gift card variable at 500 declare and assign times used at 3
    print using giftcard and subtract 150 from the amount reduce the times used by one
    print using giftcard and subtract 99 from the amount reduce the time used by one
    print information at the end
    */

     public static void main(String[] args) {

        double giftCard = 500;// 500 int number ama double'a otomatic casting olabilir
        int timesUsed = 3;
         System.out.println("Using giftcard. $150 removed");
         giftCard -= 150; // giftCard = giftCard - 150;//iki islemi de yapabilirsin ilki short way
         timesUsed--;//doesnt matter pre_or post decrement \. we just subtracting by 1
         System.out.println("Using giftcard. $99 removed");
         giftCard -= 99;
         timesUsed--;
         System.out.println("Gift card balance left  $ " + giftCard);
         System.out.println("Number if times card can be use: " + timesUsed);
         //int balance = giftCard - 150;
        /* int balance2 = balance - 99;

          System.out.println("Gift card: $" + giftCard +
                "\nTimes: " + timesUsed);
          System.out.println("The amount after first purchase is: $" + balance +
                "\nTimes remaining: " + --timesUsed);
          System.out.println("The amount after second purchase is: $" + balance2 +
                "\nTimes remaining: " + --timesUsed);


        */




    }
}
