package day36_custom_classes;

import java.util.ArrayList;

public class FoodObject {
    public static void main(String[] args) {

        Food[] foodArray = new Food[3];
        foodArray[0]=new Food("borek");
        foodArray[1]=new Food("baklava", 1, 32.99);
        foodArray[2]=new Food("pide", 2, 5);

        for (int i = 0; i < foodArray.length; i++) {
            if (foodArray[i].name.charAt(0)=='b'){
                System.out.println(foodArray[i]);
            }
        }
        for (int i = 0; i < foodArray.length; i++) {
            if (foodArray[i].totalPrice>=20) {
                System.out.println(foodArray[i].name);
            }
        }
    }

}
