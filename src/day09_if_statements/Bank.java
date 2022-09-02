package day09_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountToWithdraw = 1_500_000;

        balance -= amountToWithdraw;//balance = balance - amounttoWithdraw
        System.out.println("Withdraw: " + amountToWithdraw);

        if (balance > 0){
            System.out.println("Acount balance is: " + balance);
        }
        if (balance < 0 ){
            System.out.println("Overdraft penalty");
            System.out.println("penalty due: " + amountToWithdraw * 0.25);
        }
    }
}
//last part