package day34_custom_classes;

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;

    public String toString() {
        return "FirstTask{" +
                "base:" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", Area=" + area +
                '}';
    }

    public void calculatedPerimeter(){
        perimeter = 2 * base + 2 * height;
    }

    public void CalculatedArea(){
        area = base * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 6.8;
        rectangle1.height = 16.0;
        rectangle1.CalculatedArea();
        rectangle1.calculatedPerimeter();
        System.out.println(rectangle1);
    }
}
