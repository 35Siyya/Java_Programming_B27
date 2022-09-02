package day07_Scanner;
  import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//how to make a Scanner variable/object
        System.out.println("Please enter a number:");
        int number = input.nextInt();//int number = 4 yazsaydik 4 cikardi your number olarak. degistirilebilen olmasi icin boyle
        System.out.println("This is your number:" + number);

    }
}
