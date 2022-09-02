package day15_string;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        /*
        declare a String variable website and check if it is valid

        website should start with:www.

        website should end with one of the following:
        .com
        .edu
        .gov
        .net

        valid website or invalid website
        bonus:why the website is invalid
         */
Scanner input = new Scanner(System.in);
        System.out.println("Enter your website");
        String website =  input.next();

        boolean validStart = website.startsWith("www.");//bu case'te switch kullanamazsin cunku boolean var
        boolean validEnd = website.endsWith(".com") || website.endsWith(".edu") ||website.endsWith(".gov")
                || website.endsWith(".net");

        if (validStart && validEnd){
            System.out.println(website + " is valid");
        }else {
            System.out.println(website + " is invalid");


        } if (!validStart){
            System.out.println("Website should start with www.");
        }

        if (!validEnd){
            System.out.println("Website should end with .com .edu .gov or .net");
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println(validStart && validEnd ? "valid website" : "Invalid website");

        System.out.println("-------------------------------------------------------------");

        String str = "today it is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today)) " + str.contains("today"));
        System.out.println("str.contains(it is)) " + str.contains("it is"));
        System.out.println("str.contains(degrees)) " + str.contains("degrees"));
        System.out.println("str.contains(it 80)) exact sequence " + str.contains("it 80"));
        System.out.println(str.contains("80") && str.contains("today"));


    }
}
