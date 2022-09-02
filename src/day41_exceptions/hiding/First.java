package day41_exceptions.hiding;

public class First {

    public static void staticMethod(){
        System.out.println("Static method from  the first class");
    }

    public void instanceMethodA(){
        staticMethod();
    }
}
