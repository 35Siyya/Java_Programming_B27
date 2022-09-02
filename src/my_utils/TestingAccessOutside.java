package my_utils;

import day38_encapculation.AccessModifiers;

//any time you use anything outside the package you import

public class TestingAccessOutside {

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();//creating object
        System.out.println(obj.a);
       // System.out.println(obj.b); b is default which is only visible in the same package, so it cannot be accessed in a different package
        //default has a access only in the same package
       // System.out.println(obj.c); c is private, so only visible in the same class
    }
}