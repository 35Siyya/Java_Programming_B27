package day15_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*
        create a class LongestWithA
         ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	     Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 words:");
        String first = input.nextLine();
        String second = input.nextLine();
        String third = input.nextLine();
        String longestStr = "";

        if (first.contains("a")) {
            longestStr = first;
        }

        if (first.length() > second.length() && first.length() > third.length()) {
            if (first.contains("a"))
                System.out.println("Longest input with letter 'a' is : " + first);
        } else if (second.length() > first.length() && second.length() > third.length()) {
            if (second.contains("a"))
                System.out.println("Longest input with letter 'a' is : " + second);
        } else if (third.length() > first.length() && third.length() > second.length()) {
            if (third.contains("a"))
                System.out.println("Longest input with letter 'a' is : " + third);
        }
        System.out.println("------------------------------------------------------------------");

        String word1 = "Java";
        String word2 = "mouse";
        String word3 = "computer";

        int word1len = word1.length();
        int word2len = word2.length();
        int word3len = word3.length();
        String longest = "";

        if (word1.contains("a") && word1.length() > longest.length()) {
            longest = word1;
        }
            if (word2.contains("a") && word2.length() > longest.length()) {
                longest = word2;
            }
                if (word3.contains("a") && word3.length() > longest.length()) {
                    longest = word3;


                }
                System.out.println(longest + " is the longest with a");
            }
        }