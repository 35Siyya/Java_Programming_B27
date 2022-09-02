package day35_custom_classes.carpet;

public class Carpet {

    public double width;//instance variables
    double length;//instance variables
    double unitPrice;//instance
    boolean isPersian;//instance
    double totalPrice;//instance var.

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputPersian){// we have 4 argument we just used 4 of them(parameters also local constructors)//****public Carpet part is constructor****

        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;
        calculatePrice();//printing price
        //lets make method at below then we can calculate them
    }
    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice += 200;

        }
    }

    public String toString(){
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", " + (isPersian ? "Persian" : "Regular") + " carpet " +
                ", totalPrice= $" + totalPrice +
                '}';
    }

}


