package day06_operators;

public class UnaryExample {
    public static void main(String[] args) {

        int n = 0;
        n++; // post increment plus adding just 1
        System.out.println(n);
        ++n;// pre increment, value becomes 2
        System.out.println(n);//2

        System.out.println(++n); // pre increment, value becomes 3 then it prints the value

        System.out.println(++n);

        System.out.println(n);

        System.out.println("post number:");

        System.out.println(n++);
        System.out.println(n);

        System.out.println("---------------------------------------------------");

        int x = 4;
        int y = x;
        int z = ++x;

        System.out.println("x " + x);
        System.out.println("y " + y);

        System.out.println("----------------------------------------------------");

        int candy =5;
        System.out.println("Your kid asks for candy , you have " + candy);
        System.out.println("You give them, so now you have " + --candy);
        System.out.println("The sibling comes in and they want one, you check how many there is and give them one"
                           + candy-- );//post decrement which means checkin what you have
        System.out.println("Total candy in jar now " + candy);

        //Use Case: counting:
        //your name, find how many times your name has the letter 'a'

        int counter = 0;
        counter++;
        //we find another a
        counter++;
    }
}
