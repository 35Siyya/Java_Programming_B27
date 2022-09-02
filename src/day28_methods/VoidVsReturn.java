package day28_methods;

public class VoidVsReturn {
    public static void main(String[] args) {
        sayHello();
        sayBye();//return value was not used, so we don't see any difference charAt(0)
        System.out.println(sayBye());//methods return String, I am print a string
        String str = sayBye(); //methods return string and method assigned the result into the new variable
    }
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static String sayBye(){
        return "Bye";
    }
}
