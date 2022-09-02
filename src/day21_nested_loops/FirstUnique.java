package day21_nested_loops;

public class FirstUnique {
    public static void main(String[] args) {
        /*
        Write a program that can return the index number of the first unique character.

         */
        String str = "aaaabccccdeeef";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count ==1){
                System.out.println(str.indexOf(str.substring(i,i+1)));
                break;
            }
        }
    }
}
