package day06_operators;

public class LogicalExamples {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isGoodTemp = false;
        boolean doBbq = isWeekend && isGoodTemp;
        /*
        this is not necessary
        isWeekend == true && isGoodTemp == true;
         */

        System.out.println("do bbq: " + doBbq);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFirefighter = false;
        boolean getDiscount = isTeacher || isPolice || isFirefighter;

        System.out.println("get a discount: " + getDiscount);
        // goal: 5 < number < 10
        int number = 8;
        System.out.println(number > 5 && number < 10);// true && true --> true
        System.out.println(number > 0 && number < 5);//true && false --> false

        int age = 40;
        boolean inValidAge = age < 0 || age > 120;// false || false


    }
}
