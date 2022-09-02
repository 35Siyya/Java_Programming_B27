package day34_custom_classes;

public class Car {
    String model;
    int year;
    String color;
    double fuel;

    @Override
    public String toString() {
        return "SecondTask{" +
                "model:'" + model + '\'' +
                ", year:" + year +
                ", color:'" + color + '\'' +
                ", fuel:" + fuel +
                '}';
    }

    public void drive(){
        System.out.println("Driving: " + model);
    }

    public void fillTank(){
        System.out.println("filling tank");
    }

    public void isFull(){
        if (fuel < 25){
            System.out.println("fuel is: " + fuel + "%");
            fillTank();
            fuel = 100;
        }else {
            System.out.println("Still good on gas: " + fuel + "%");
        }
    }


    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Lincoln";
        car1.year = 2022;
        car1.color = "Black";
        car1.fuel = 78;
        System.out.println(car1);
        car1.drive();
        car1.isFull();

    }
}
