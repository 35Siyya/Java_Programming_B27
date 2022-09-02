package day05_arithmetic_operators;

public class AverageNumber {

    public static void main(String[] args) {
        //create a class AverageNumber, and write a program that will define 4 scores and find the average of the scores

         int score1 = 90;
         int score2 = 100;
         int score3 = 94;
         int score4 = 97;
         int avg = (score1+score2+score3+score4)/4;
         System.out.println("Score1:" +score1+"\n"+"Score2:" +score2+"\n"+"Score3:" +score3+"\n"+"Score4:" +score4+"\n"
                 + "Average Score: " +avg);
    }
}