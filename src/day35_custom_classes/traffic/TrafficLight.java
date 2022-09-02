package day35_custom_classes.traffic;

public class TrafficLight {
    public String color;

    public TrafficLight(String inputColor){//yukaridaki color'in aynisini kullanamiyoruz.o yuzden inputColor yaptik farkli isim kullanmak icin
        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green");

        if(isValid){
            color = inputColor;
        }



        }

    }

