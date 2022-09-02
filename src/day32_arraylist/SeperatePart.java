package day32_arraylist;

import java.util.ArrayList;

public class SeperatePart {
    public static void main(String[] args) {
        /*
        Write a program that can extract the special characters, digits and letters from a string and
        stores them into separate ArrayLists of Characters

Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}

         */
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character>letters = new ArrayList<>();
        ArrayList<Character> numbers= new ArrayList<>();
        ArrayList<Character>characters = new ArrayList<>();

        for (int i = 0; i < str.length() ; i++) {
            char letter = str.charAt(i);

            if (Character.isDigit(letter)){
                numbers.add(letter);
            } else if (Character.isLetter(letter)) {
                letters.add(letter);
            }else {
                characters.add(letter);
            }


        }
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(characters);
    }
}
