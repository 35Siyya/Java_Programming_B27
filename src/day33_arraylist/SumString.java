package day33_arraylist;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SumString {
    /*
    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */
    //nums = [] sonra [6,7]

    //each:"123" first element -->"34" oldu
    //sum = 0--> 7
    //eachDigit: ["1", "2", "3"] -->["3", "4"]  islemin isleyisi
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513", "4913", "1248"));
        System.out.println(list);
        System.out.println(sumOfDigits(list));

    }
    public static ArrayList<Integer> sumOfDigits(ArrayList<String> list){

        ArrayList<Integer> nums = new ArrayList<>();

        for (String each : list){ //each is every whole number as String format

            int sum = 0;

            for (String eachDigit : each.split("")){//splits the each into a String array where each digit is a separate element
              sum += Integer.parseInt(eachDigit);

                }

            nums.add(sum);

            }
        return nums;
        }
    }

