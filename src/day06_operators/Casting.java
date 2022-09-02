package day06_operators;

public class Casting {
    /* create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:

     */
          public static void main(String[] args) {

              float averageScore = 20.5f;
              byte num1 = (byte)averageScore;//float bigger than byte, so we need to cast
              short num2 = (short)averageScore;//float is bigger than short we need to cast(average score is float, we need casting
              int num3 = (int)averageScore;//float bigger than int, so we need to cast
              long num4 = (long)averageScore;
              float num5 = averageScore;// the same type, no casting
              double num6 = averageScore;// double is bigger than float, so we dont need to cast to float

             String report = "Average Score: \n" + num2 + "\n" + num3 + "\n" + num4
             + "\n" + num5 + "\n" + num6;
              System.out.println(report);










    }
}
