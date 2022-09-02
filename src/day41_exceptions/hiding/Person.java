package day41_exceptions.hiding;

public class Person {
    String name = "James Bond";
}
 class SecretIdentity extends Person{
    String name = "dnobsemaj";//doing variable hidding, the original one, os hidden,  but now I have a new same name
 }

 class Runner{
     public static void main(String[] args) {
         //could I have to declare as a normal reference then access the variable? Yes, but just to show quickly we made objects without reference
         System.out.println(new Person().name);
         System.out.println(new SecretIdentity().name);
     }
}
