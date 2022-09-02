package day41_exceptions.try_catch;

public class ExampleOne {
    public static void main(String[] args) {

        String s = null;

     //   System.out.println(s.length()); This would cause a NullPointerException

        s = "hello";
      //  System.out.println(s.charAt(10)); This would cause a StringIndexOutOfBoundsException - during

        System.out.println("Hello");

       // Thread.sleep(5000);==> //Thread is a class and sleep making stop that code parts(the method
       // has some possible checked exception, so we need to handle it before we can compile-checked- compile time)
    }
}
