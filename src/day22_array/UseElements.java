package day22_array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {

        int [] nums = {4, 5, 12};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]);//int + int

        String [] str = {"Hello", "World", "Java", "Code"};
        System.out.println(str.length);//how many elements in array
        System.out.println(str[2]);
        System.out.println(str[2] + str[3]);// String + String
        System.out.println(str[0].length());//String method length() --> tell the number of character in the String

        System.out.println(str[1].charAt(str[1].length() -1));//last index of the element at index 1

        String s = str[3];//assigning the value of the 3rd index of the array in to a new String variable s
    }
}
