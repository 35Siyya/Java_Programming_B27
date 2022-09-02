package day17_string;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        //this is infinite loop it doesn't stop.we have to stop
       // while(true){
       //   System.out.println("Hello World");
       // }

        //print 50 times
        int counter = 1;//0 loop counter < 50

        while(counter <= 50){
            System.out.println("Hello World " + counter);
            counter++;//infinite loop'u durdurmak icin ekledik --> (counter++)This line adds 1 to the number each iteration,it allows the loop to stop at some point
            //iteration means each cycle of execution (every loop gibi sanirim)
        }


    }
}
