package day35_custom_classes.traffic;

import day35_custom_classes.traffic.TrafficLight;

public class Road {
    public static void main(String[] args) {


        TrafficLight light = new TrafficLight("green");//White part you are calling its the argument you calling
        //light.color = "green";

        System.out.println(light.color);

        //invalid case:
        TrafficLight light2 = new TrafficLight("blue");
        //light2.color="blue"//if you dont have costructor like line 13 you can use like this but it not reusable
        System.out.println(light2.color);


    }
}