package day22_array;

public class Initials {
    public static void main(String[] args) {
        /*
        Please type only 2 lines of using String manipulation methods.
        Output should be C.N with capital letters and no space.
        */


        String name = " chuck norris ";
        int initial = name.trim().indexOf(' ');
        name = name.trim().substring(0, 1).toUpperCase() + "." +
                name.trim().substring(initial + 1, initial + 2).toUpperCase() + ".";
        System.out.println(name);


    }
}
