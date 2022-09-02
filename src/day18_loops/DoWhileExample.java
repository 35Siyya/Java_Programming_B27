package day18_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i);
        }while (false);
        //the do block is executed first, then the boolean is checked
        System.out.println();
     //yukarida ki ayri loop sadece 0 sonucunu verdi.Alttaki loop 10'a kadar yazdirdi
        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }
}
