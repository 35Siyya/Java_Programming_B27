package day19_loops;

public class CountLetter {
    public static void main(String[] args) {
        // frequency

        //word -> java
        // how many 'a' chars?
        String word = "galatasaray";
        int count = 0;

        for (int i = 0; i < word.length(); i++) { // i <=
           if (word.charAt(i) == 'a'){
               count++;
           }
        }
        System.out.println(count);
    }
}
