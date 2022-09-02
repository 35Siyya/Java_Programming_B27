package day20_loops;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        IQ] Prime number

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime


Ex:
	Input:
		10

	Output:
		not prime

         */

        String s = "java";
        String result = "";

        for (int i = 0; i < s.length(); i++) { // i <= s.length() -1
           char letter = s.charAt(i);

           if (letter == ' '){
               result += "_ ";
           }else {
               result += letter + " ";
           }
        }
        System.out.println(result.trim());
    }
}
