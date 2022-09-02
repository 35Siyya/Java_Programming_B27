package day31_arraylist;

import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
      /*
      Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

       */

        ArrayList<String> words = new ArrayList<>();

        words.add("Hat");
        System.out.println(words);
        words.add("Shoes");
        System.out.println(words);
        words.add(1, "Jacket");
        System.out.println(words);
        words.add(0, "Towel");
        System.out.println(words);
        words.add(1, "Car");
        System.out.println(words);


        System.out.println("---------------------------------------");
        /*
        Create an ArrayList of Strings
     add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

     Print the ArrayList after each action to see how the change is made
      */
        ArrayList<String> hero = new ArrayList<>();

        hero.add("Iron Man");
        hero.add("Spider man");
        hero.add("Thor");
        hero.add("Captain America");
        hero.add("Hawkeye");

        System.out.println(hero);
       // int indexOfThor = hero.indexOf("Thor");      57. satir ve 61 . satir araligi farkli sekilde daha dynamic yapildi
       // System.out.println(indexOfThor);

       // hero.remove(indexOfThor); // remove(2) -> but more dynamic
        //System.out.println(hero);//print systema kadar dama dynamic bi kisimda

        hero.remove(2);
        System.out.println(hero);

        hero.remove("Iron Man");
        System.out.println(hero);

        hero.remove(0);
        System.out.println(hero);

        System.out.println("------------------------------------------------");

        /*
            Create an ArrayList of Characters
            Fill the ArrayList with letters of your name. Each letter as a different element
             Print each letters on a separate line by accessing each element
         */

        ArrayList<Character> name = new ArrayList<>();

        name.add('s');
        name.add('e');
        name.add('y');
        name.add('h');
        name.add('a');
        name.add('n');

        for (char eachLetter : name) {
            System.out.println(eachLetter);
        }
            System.out.println("------------------------------------");

            /*
            try to loop:

              Create an ArrayList of Characters
             Fill the ArrayList with letters from a-z
              Print the ArrayList of all the characters
              Manually remove each vowels and print the new ArrayList
              */

            ArrayList<Character>letters = new ArrayList<>();

            for (char i= 'a'; i <='z'; i++) {
                letters.add(i);
            }
               System.out.println(letters);

                letters.remove(( Character)'a');
                letters.remove(( Character)'e');
                letters.remove(( Character)'i');
                letters.remove(( Character)'o');
                letters.remove(( Character)'u');

                System.out.println(letters);

            System.out.println("-------------------------------");

            /*
            Try to loop:

               Create an ArrayList of Double elements
               Fill the ArrayList with some values
               Find the max element from the ArrayList
           */

            ArrayList<Double> numbers = new ArrayList<>();

            numbers.add(27.8);
            numbers.add(122.5);
            numbers.add(3.5);
            numbers.add(21.2);

            System.out.println(numbers);

            double max = Double.MIN_VALUE;
            for (int i = 0; i < numbers.size(); i++) {
                if(max < numbers.get(i) ){
                    max = numbers.get(i);
                }

            }
            System.out.println(max);

            }


        }
