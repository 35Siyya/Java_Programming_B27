package day21_nested_loops;

public class Dublicates {
    public static void main(String[] args) {
        /*
        [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.
     -> the characters A C and E are found in the String multiple times, so they are duplicates
    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

         */
        String str=" AAABCCDEEF";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count>1&&!result.contains(str.substring(i,i+1)))
                result+=str.charAt(i);
        }
        System.out.println("result = " + result);
    }
}


