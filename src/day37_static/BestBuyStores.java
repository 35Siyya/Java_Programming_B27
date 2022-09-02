package day37_static;

import java.util.Arrays;

public class BestBuyStores {
    public static void main(String[] args) {

      //BestBuy.location = "Fairfax"; location is an instance variable, so we need an object in order to acces
        BestBuy store1 = new BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);

        System.out.println(BestBuy.headquarters);//this is static variable, which means we can use the class name to access
        System.out.println(store1.headquarters);//this is valid syntax, but you should use the class name to access, but instance references

        //other static members
        System.out.println(Math.PI);// PI is a static
        //when you're seeing all capital it means instance
       // Arrays.sort();//this is basically just class
          System.out.println(Integer.MIN_VALUE);//min value is static
        //accessing static methods from the Arrays class

    }
}
