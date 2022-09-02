package day07_Scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(false && true);
      //System.out.println( 5 / 0 ); you cannot divide by 0.i'ts gonna stopped our program

      //  System.out.println(true && 5/0 == 0);
        System.out.println(false && 5/0 == 0);

       // System.out.println(false & 5/0 == 0);

        System.out.println(true || false);

        int count = 0;
        System.out.println( true || count++ ==1);//tru"dan sonrasina bakmadi bile ilk kismi calistirdi codun o yuzden hala "0";
        //1 tane "&" kullansaydik kod dogru yada degil bakmaz 1 sonucunu cikarirdi yani diger islemi de yapardi...
        System.out.println(count);

    }
}
