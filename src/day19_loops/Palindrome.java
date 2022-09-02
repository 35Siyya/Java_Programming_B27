package day19_loops;

public class Palindrome{
    public static void main(String[] args) {
        /*
    given a string determine if it is palindrome
    palindrome means the string is read the same forwards and backwards
     */
     /*
        String word = "anna";

        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);

        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);
*/
        String s = "racecar";
        String reverse = "";
        // reverse my String, read it back from last index to first, backwards

        for(int i = s.length() - 1; i >= 0; i--){ // i is just a number, but using length - 1 allow me to find the last index of the String, that means we can use that index to read characters
            reverse += s.charAt(i);
        }

        System.out.println(reverse);

        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println(s.equals(reverse) ? "Palindrome" : "Not Palindrome");


    }


}




