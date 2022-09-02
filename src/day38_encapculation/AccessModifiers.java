package day38_encapculation;

public class AccessModifiers {

    public int a = 5;
    int b= 10;//this has access because I didnt use any other modifier
    private int c = 20;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();//creating object
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
