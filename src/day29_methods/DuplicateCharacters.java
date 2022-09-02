package day29_methods;
import my_utils.*;

public class DuplicateCharacters {
    public static void main(String[] args) {
        System.out.println(dublicateChar("AAAAMMMBBBKETTT"));
        System.out.println(getDuplicateCharacters("AAABCCDEEF"));
        System.out.println(getDuplicateCharacters("ISJWJBwwiwqie"));
    }

    public static String dublicateChar(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            int count = StringUtils.frequencyOfChar(str, str.charAt(i));
            if (count > 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    /*
    [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times so they are duplicates

    variations:
        Write a program that can return the first duplicated character from a string
        Write a program that can return the index number of the first unique character.
        
*/




        public static String getDuplicateCharacters (String str){

            String duplicate = "";

            for (int i = 0; i < str.length(); i++) {
                //str.charAt(i) --> give every character

                if (duplicate.contains("" + str.charAt(i))) {
                    continue;
                }

                int frequency = StringUtils.frequencyOfChar(str, str.charAt(i));

                if (frequency > 1) {
                    duplicate += str.charAt(i);
                }

            }

            return duplicate;
        }

    }


/*          String str = AAABCCDEEF
            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));
            StringUtil.frequencyOfChar(str, A);
            StringUtil.frequencyOfChar(str, B);
            StringUtil.frequencyOfChar(str, C);
            StringUtil.frequencyOfChar(str, D);
            StringUtil.frequencyOfChar(str, E);
*/

