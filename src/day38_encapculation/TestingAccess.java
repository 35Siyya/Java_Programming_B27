package day38_encapculation;

public class TestingAccess {

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();//creating object
        System.out.println(obj.a);
        System.out.println(obj.b);
        //   System.out.println(obj.c); c is private and we are outside the class,so no access
        // c is inside the another class and that class is not public it is a private, so you can't access
    }
}