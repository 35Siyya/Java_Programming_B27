package day12_switch;

public class SwitchExamples {
    public static void main(String[] args) {

        int day = 9;//number from 1-7,where 1 is monday and 7 is sunday
        switch (day){
            default://acts like else, if no other case matches the default case will run
                System.out.println("Not a valid day number, should 1 to 7");

            case 1://if(day == 1)
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 ://if(day == 3)
                System.out.println("Wednesday");
                break;
            case 4://if(day == 4)
                System.out.println("Thursday");
                break;
            case 5://if(day == 5)
                System.out.println("Friday");
                break;
            case 6://if(day == 6)
                System.out.println("Saturday");
                break;
            case 7://if(day == 7)
                System.out.println("Sunday");
                break;




        }
    }
}
