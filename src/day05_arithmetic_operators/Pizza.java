package day05_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {

        String type = "Cheese";
        int pizzaSlices = 10;
        int people = 3;
        int slicesPerPerson = pizzaSlices / people;
        int leftOverSlices = pizzaSlices % people;

        System.out.println(people + " people are going to eat the " + type + " pizza..\nEvery person will get "
                + slicesPerPerson + " slices and there will be " + leftOverSlices + " left over");

    }
}
