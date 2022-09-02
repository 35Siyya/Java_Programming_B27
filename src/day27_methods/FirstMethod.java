package day27_methods;

public class FirstMethod {

    public static void helloWorld(){
        System.out.println("Hello World!");

    }

    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.print("Hello World");
        }
        }

    public static void main(String[] args) {
        helloWorld();
        helloWorld();

        //print helloWorld 5 times?
        for (int i = 0; i <5 ; i++) {
            helloWorld();

        }
        System.out.println();

        helloWorld5Times();//this method  prints hello world 5 times.We create that method

        helloWorld5Times(); // this method prints hello world 5 times

    }

}
