package day38_encapculation;

public class UseRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
       // rectangle1.Length = 10;We don't have direct access, but I have access indirectly with getter and setter
       // rectangle1.Width = 5;
        //use setter methods to assign
        rectangle1.setLength(10);
        rectangle1.setWidth(5);

       // System.out.println(rectangle1.getLength);
       // System.out.println(rectangle1.getWidth);

//use getter methods to read/use the value
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

    }
}
