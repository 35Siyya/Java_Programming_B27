package day04_variables;

public class Recap {
    public static void main(String[] args) {

        // declare variables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDays;

        //assigning value to variables

        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftSkillsDays = 2;

        System.out.println("temperature = " + temperature + " Celsius ");//soutv automatically making cocncatination in pharantes
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays);

        //declare and assign same time example
        int numberOfCoffeeCups = 2;
        float ratingOfMovie = 8.9f;//f koymazsan sayiyi double olarak algiliyor.Buyuk yada kucuk "f"
                                   // koyuyoruz rakam sonuna.
        long waterInOcean = 20000000000000L;//"L" koymazsan compiler int algiliyor cok buyuk sayi oldugu icin
                                            // long'a cevirmelisin.Yoksa code calismaz hata verir...

        System.out.println("numberOfCoffeeCups = " + numberOfCoffeeCups);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean + " liters ");
    }
}
