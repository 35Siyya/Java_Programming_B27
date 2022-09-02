package day11_nested;

public class FieldTrip {
    public static void main(String[] args) {


        int grade = 6;
        String location = "";
        String teacher = "";
        int numberOfGroups = 0;

        int garde;
        if (grade > 0 && grade <= 6){
            // valid grades

            if (grade ==1){
                location = "Apple Orchard";
                teacher = "Ms Smith";
                numberOfGroups = 5;
            }else if (grade ==2){
                location = "Zoo";
                teacher = "Ms Bond";
                numberOfGroups = 6;
            }else if (grade ==3){
                location = "Aquarium";
                teacher = "Ms Ryes";
                numberOfGroups = 2;
            }else if (grade ==4){
                location = "Museum";
                teacher = "Ms Wilson";
                numberOfGroups = 7;
            }else if (grade ==5){
                location = "Apple Orchard";
                teacher = "Ms Bond";
                numberOfGroups = 5;
            }else if (grade ==6){
                location = "Six Flags";
                teacher = "Ms Bond";
                numberOfGroups = 10;

            }
            System.out.println("Grade " + grade);
            System.out.println("Location: " + location);
            System.out.println("NumberOfGroups " + numberOfGroups);

        }else{
            //invalid grades
        }

    }
}