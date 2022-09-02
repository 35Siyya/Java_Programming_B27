package day23_array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {


        int[] nums = {4,213,6};

        //print whole array
        System.out.println(Arrays.toString(nums));

       // print each on a separate line hard coded index
        System.out.println("HardCoded");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

       // printing each loop with for loop
        System.out.println("With for Loop");

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        //create our own printing format:
        String arrayAstring = "Array ~ ";
        for (int i = 0; i < nums.length; i++) {
            arrayAstring += nums[i] + " | ";

        }
        arrayAstring += "~ END";
        System.out.println(arrayAstring);
    }
}
