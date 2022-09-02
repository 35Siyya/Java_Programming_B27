package day06_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 21;

        boolean isCitizen = true;
        boolean isCriminalBackground = false;
        boolean over18 = age >= 18;

        boolean isEligible = isCitizen && over18 && !isCriminalBackground;

        /*
          int age = 21;

        boolean isCitizen = true;
        boolean isCriminalBackground = false;
        boolean over18 = age >= 18;

        boolean isEligible = isCitizen && over18 && !isCriminalBackground;

            true && true && !false
            true && true && true
                true &&   true
                     true
        ---------------------------------------------------------------------------------


         */
        System.out.println();
    }
}
