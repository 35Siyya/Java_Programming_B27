package day32_arraylist;

import java.util.ArrayList;

public class PrintName {
    public static void main(String[] args) {
        /*
            Create an ArrayList of Characters
            Fill the ArrayList with letters of your name. Each letter as a different element
             Print each letters on a separate line by accessing each element
         */
        ArrayList<Character> name = new ArrayList<>();
        name.add('S');
        name.add('e');
        name.add('y');
        name.add('h');
        name.add('a');
        name.add('n');

        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
        System.out.println(name.get(4));
        System.out.println(name.get(5));

    }
}
