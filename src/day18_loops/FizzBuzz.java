package day18_loops;

public class FizzBuzz {
    /*
   write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
   1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
   2.  For numbers which are divisible by 5, print "Buzz" instead of the number
   3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number
    */
    public static void main(String[] args) {

        int i = 1;
        int count = 50;
        int result = 0;

        while(i < count){
            if(i % 5 == 0 && i % 3 ==0) {
                result = i;
                System.out.println(  result + " -FizzBuzz");

            }else if (i % 3== 0){
                result = i;
                System.out.println( result + " -Fizz");
            } else if (i % 5 == 0) {
                result = i;
                System.out.println(result + " -Buzz");

            }else {
                System.out.println(i);
            }

            i++;


        }


    }
}
