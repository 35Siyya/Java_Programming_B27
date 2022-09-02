package day34_custom_classes.app;

import day34_custom_classes.app.App;

public class AppStore {

    public static void main(String[] args) {
    App instagram = new App();
    instagram.name = "Instagram";
    instagram.version = 12.1;
    instagram.isFree = true;
    instagram.ratings = 4;

    instagram.update();//this method calling the instance method by the object/reference
       // System.out.println(instagram.name);
       // System.out.println(instagram.version);
      //  System.out.println(instagram.isFree);
      //  System.out.println(instagram.ratings);

        System.out.println(instagram);//toString we can print the object from another class

        System.out.println(instagram.toString());//this part is not necessary because toString is automatically called




    }
}
  /*
        //instance method
       // String s = "java";//from the string class
        //s.length();// to find number of characters
       */