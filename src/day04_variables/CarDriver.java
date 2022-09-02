package day04_variables;

public class CarDriver {
    /*
    create a class CarDriver create a main method

    declare and assign these variables with the most appropriate datatypes:
     driver name, car model, license number, license class, speed, is automatic

     create a summary of the information and print it. Be creative
     */
    public static void main(String[] args) {

        String driverName ="Ella Hazel";
        String licenseNumber = "N-100-234-567-7777 ";
        char dLicenseClass = 'B';
        String brand = "Cadillac";
        String model = "Escalade";
        String type = "Luxury";
        int year = 2022;
        String maxSpeed = "130 MPH";
        boolean isAutomatic = true;
        boolean isThirdRow = true;
        System.out.println("\tCar Information:\nDriver Name:" +driverName);
        System.out.println("License Number:" + licenseNumber + "\nLicence Class:" + dLicenseClass);
        System.out.println("Car Brand:" + brand + "\nCar Model:" + model + "\nCar Type:" + type);
        System.out.println("Year:" + year + "\nMax Speed:" + maxSpeed + "\nAutomatic:" + isAutomatic +"\nThird Row:" +isThirdRow);











    }
}
