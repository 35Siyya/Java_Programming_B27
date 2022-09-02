package day03_variables;

public class School {
          /*
           Add a new class School add main method declare and assign all these variables:
           (all int) grade1, grade2, grade3, grade4, grade5
           assign the number of students in each grade
           extra: try to create another variable to find the total number of students in the whole school
           (all double) average gpa, number of school days, number of snow days
           */

      public static void main(String[] args) {

          int grade1 = 102;
          int grade2 = 98;
          int grade3 = 125;
          int grade4 = 132;
          int grade5 = 154;

          System.out.println("First Grade  = " + grade1);
          System.out.println("Second Grade = " + grade2);
          System.out.println("Third Grade  = " + grade3);
          System.out.println("Fourth Grade = " + grade4);
          System.out.println("Fifth Grade  = " + grade5);

          int totalNumberOfStudents = grade1 + grade2 + grade3 + grade4 + grade5;
          System.out.println("\nTotal Number Of Students in the whole school = " + totalNumberOfStudents);

          double averageGPA = 4.0;
          double  numberOfSchoolDays = 185;
          double numberOfSnowDays = 15;

          System.out.println("AverageGPA = " + averageGPA);
          System.out.println("Number Of School Days = " + numberOfSchoolDays);
          System.out.println("Number Of Snow Days = " + numberOfSnowDays);



      }
}
