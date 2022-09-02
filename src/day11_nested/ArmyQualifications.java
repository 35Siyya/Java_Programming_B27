package day11_nested;

public class ArmyQualifications {
    public static void main(String[] args) {
         /*
           ages: - 35
           high school diploma
           citizen
          */

        int age = 18;
        boolean hasDiploma = false;
        boolean isCitizen = false;

        if( (age >= 18 && age <= 35) && hasDiploma && isCitizen){
            System.out.println("You Qualify for the Army");
        } else {

            // multi branch is to give information about the age
            if(age < 0 || age > 120){ // checks for valid age numbers first
                System.out.println("Not a valid age number");
            } else if (age < 18){
                System.out.println("You are too young, need to be at least 18");
            } else if(age > 35){
                System.out.println("You are too old, limit is 35 years old");
            }

            // if to check about diploma

            if(!hasDiploma){ // if you don't have a diploma then:
                System.out.println("You need at least a high school diploma");
            }

            // if to check about citizenship
            if(!isCitizen){
                System.out.println("You need to be a citizen to apply");
            }

        } // end of the else for qualifying


    }  // end of the main method
} // end of the class

