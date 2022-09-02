package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        /*
        Hide passwords
     Given an ArrayList of passwords (String). Hide each password in a star (*) format
     where each character is a star and print the ArrayList of hidden passwords
        Ex:
            Input:
          {"one", "hi", "hold}

          Output:
             [ ***, **, **** ]
         */
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold"));
        System.out.println(passwords);
        // creating a new ArrayList to store the result
        ArrayList<String> newList = new ArrayList<>();
        // going throw each element
        for(String each : passwords){
            // going throw each letter of each element
            for (int i = 0; i < each.length(); i++) {

                each = each.replace(each.charAt(i),'*');
            }
            newList.add(each);
        }
        System.out.println(newList);
    }
}
