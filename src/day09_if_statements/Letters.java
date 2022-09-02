package day09_if_statements;


public class Letters {
    public static void main(String[] args) {


        char letter = 'B';// in ASCII table  'B' is 66

        if (letter >= 'A' && letter <= 'Z') {//if the letter more than or equal to or and less than uppercase 'Z'
            System.out.println(letter + " is an uppercase letter");
        }
        if (letter >= 'a' && letter <= 'z'){
            System.out.println(letter + "is an lowercase letter");
        }
    }
}
