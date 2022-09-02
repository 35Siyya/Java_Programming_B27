package day32_arraylist;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
           /*
            Try to loop:

               Create an ArrayList of Double elements
               Fill the ArrayList with some values
               Find the max element from the ArrayList
           */
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(300);
        nums.add(800);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);

        // nums.remove(300);  the 300 is an int here, so it is trying to remove index 300
        nums.remove((Integer) 300); // 300 is being cast to Integer, so it will remove the element
        System.out.println(nums);

    }
    }

