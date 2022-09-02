package day11_nested;

public class Amazon {
    public static void main(String[] args) {

        double price = 10.99;
        boolean isPrime = false;

        if (isPrime){
            System.out.println("Free 2 days shipping");
        }else {
            // if you don't have prime its gonna check next one
            if (price >= 25){
                System.out.println("Free shipping available");
            }else {
                System.out.println("Shipping cost is $2.99");
            }
        }
    }
}
