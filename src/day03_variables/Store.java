package day03_variables;

public class Store {
    public static void main(String[] args) {
         int numberOfItems = 1000;

         System.out.println(numberOfItems + " in the store"); // combines the value of the numberOfItems variables with
                                                              // the characters 'in the store'
        numberOfItems = 700; // reassigned 700 in to the nvariable
        System.out.println(numberOfItems + " after the sale ");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment);//sotv<---(shortcut)

        double totalCoast = 1_000_000.99; // 10,0000,000.99 ->how we might want to write it, but comma's are not valid
       // java syntax, so we can use underscore in numbers, to improve readebility.
        System.out.println( totalCoast);

        float f = 19.99F; // adding the letter f/F will tell the compiler this is a float number,not a double number

        float f2 = 100; // 100 is int type by default, and int is smaller than float, so there is no problem here
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 100;valid if I wanted
        // float f2 = 100F;
        // float F2 = 100.99F;

        Long population = 8_000_000_000L;
        System.out.println(population);

        long pop2 = 1_000_000; // L is not needed because 1 million is a valid number for int types and that type can
        // autamoticly
    }
}
