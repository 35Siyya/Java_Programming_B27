package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer", "reading", "coding", "java", "coding", "java", "summer"));
        System.out.println(searchInList(list, "java"));
        System.out.println(searchInList(list, "coding"));
        System.out.println(searchInList(list, "friday"));

        //testing the Easydata

      //  ArrayList<String> test = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        //Above can only use in this file, but below we are using the dynamic method that can create that arrayList with those

        ArrayList<String>days = EasyData.getDaysOfWeek();
        System.out.println(days);

    }

    public static int searchInList(ArrayList<String> list, String target){
        int count = 0;
        for (String each: list){
            if (each.equalsIgnoreCase(target)){
                count++;
            }
        }
        return count;
    }
}
