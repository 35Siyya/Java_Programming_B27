package day04_variables;

public class Computer {
    /*create a class Computer
create a main method

    declare and assign these variables with the most appropriate datatypes:

        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth

        create a summary of the information and print it. Be creative
         */
    public static void main(String[] args) {
        String brand = "Apple";
        String processor = " M2";
        int ramCapacity = 32;
        double storagePerGB = 500.00;
        boolean hasMonitor = true;
        boolean hasWifiCard = true;
        boolean hasBluetooth = true;
        String price = "$1300";
        byte Usbslots = 2;

        System.out.print("\t Computer Futures:\nBrand Name: " + brand +"\nProcessor: "  + processor );
        System.out.print("\nRamCapacity: " + ramCapacity +"\nStorage: " + storagePerGB);
        System.out.print("\nMonitor: " + hasMonitor +"\nWifi: " + hasWifiCard +"\nBluetooth: " + hasBluetooth);
        System.out.println("\nPrice: " + price +"\nUsblots: " + hasBluetooth);


    }

}
