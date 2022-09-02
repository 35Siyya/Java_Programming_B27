package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String item = "pen";// in String pool
        String item2 = new String("pen");//
        System.out.println();

        System.out.println("----------------------------------------");
        String username = "jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));
        System.out.println(password.equals("bond007"));
        System.out.println("--------------------------------------------");

        String day = "Tuesday";
        System.out.println(day.length());// counts how many character in there
        String day2 = "Friday";
        int len = day2.length();
        System.out.println(len);

        String str = " hello ";
        System.out.println(str.length());
        System.out.println(str);

        System.out.println("-----------------------------------------");
        String word = "Summer";
        word.toUpperCase();//makes all characters uppercase, but we didnt do anything with this value
        System.out.println(word);
        word = word.toUpperCase();//this time we make all the characters uppercase then the String gives us back(all uppercase)was reassigned in to the variable
        System.out.println(word);

        System.out.println("------------------------------------------------");
        String sentence = "hello My NAME is";
        System.out.println(sentence.toLowerCase());//make a new string that was all lowercase,and then printed it
        System.out.println(sentence);//print the original String, because String is immutable it cannot change
        String lowerVer = sentence.toLowerCase();
        //option3: reassign
        // sentence = sentence.toLowerCase();


        System.out.println("--------------------------------------------------");
        String s = "         java       ";
        System.out.println(s);
        System.out.println(s.length());
        s = s.trim();// trim method gets rid of all the extra spaces in the beginning and end of a String
        System.out.println(s);
        System.out.println(s.length());

        String s2 = "    multiple    words    here    ";
        System.out.println(s2.trim());// trim will remove from beginning and end, middle spaces will not be touched
    }
}
