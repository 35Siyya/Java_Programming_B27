package Day10_if_statements;

public class CampusTime {
    /*
    create an int value for the time of the day. use a 24 hours format, use the given time of day to display a message
    hin: use seperate if statements
    if the hours are from 6 - 11, print:Good morning
    ''''''''''''''from 12 -16, print good evening
    """""""""""""""from 17 - 23 0r 0 _5,print: good night

     */
    public static void main(String[] args) {

        int time = 23;//24 saat ve fazlasi en sonda olan condition yazdirir..

        if (time >= 6 && time <= 11){
            System.out.println("Good morning");
        }else if (time >= 12 && time <= 16){
            System.out.println("Good evening");
        }else if ((time >= 17 && time <= 23) || (time>= 0 && time <= 5)){
            System.out.println("Good night");
        }else {
            System.out.println("Not in 24h range");
        }
    }
}
