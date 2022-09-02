package day06_operators;

public class Walking {
    public static void main(String[] args) {
        /*  create a class Walking declare and assign a boolean variable is raining
           declare and assign a temperature variable check if you should go for a walk.
           You should go for a walk if it is not raining and the temperature is more than 68
        */

        boolean isRaining = false;
        double temp = 65;
        boolean temp1 = temp > 68;
        boolean goWalk = !isRaining && temp1;

        System.out.println("You should go for a walk: " + goWalk);


    }
}
