package day27_methods;

public class Practice {
    public static void main(String[] args) {
        String [] dailyQ = {"wish you", "an awesome week", "please", "give up", "you can", "never","succeed","keep studying",
        "everyday", "no way", "you will succeed!"};
        String javaFun = "true";
        boolean False = javaFun.length() >=4 ? true: false;
        while (False){
            System.out.print(dailyQ[2] + " " + dailyQ[5] + " " + dailyQ[3] + " " + dailyQ[7] + " " + dailyQ[8] + " " +dailyQ[10] + "\n");
            if (False == true)
                System.out.println("See you on meeting my Team");
        }
    }
}
