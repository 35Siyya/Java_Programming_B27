package day30_practice_wrapper;

import my_utils.ArrayUtil;

public class UsingArraysUtilClassPr {

    public static void main(String[] args) {


            int num = ArrayUtil.min(4, 2, 1, -5, 1, -1, 2, 5, 2, -1, 5);
            System.out.println(num);
            System.out.println(ArrayUtil.min(5, 3, 4, 5, 2, 5, 8));

            System.out.println(ArrayUtil.max(5, 3, 4, 5, 2, 5, 8));

        }
        /*
    Group of utility methods for arrays
    Extra practices from 08/01 will be done here
     */

    /*
    Min Number
        create a method that will accept an int array and return the smallest number from the array
    */

    public static int min(int ... arr){ // int [] arr IS THE SAME AS int ... arr
        int min = arr[0];

        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

    /*
    Max Number
        create a method that will accept an int array and return the biggest number from the array
     */
    public static int max(int ... arr){
        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }






}




