package day05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 120_000;
        double stateTaxRate = 0.08;
        float casting = (float)stateTaxRate;
        double federalTaxRate = 0.21;
        double stateTax = salary*stateTaxRate;
        double federalTax = salary*federalTaxRate;
        double totalTax = stateTax+federalTax;
        double salaryAfterTax = salary-totalTax;
        System.out.println("Salary: " +salary+ "\nState Tax Rate: "+ casting+"\nFederal Tax Rate: "+federalTaxRate);
        System.out.println("State Tax: "+ stateTax + "\nFederal Tax: " +federalTax+"\nTotal Tax: "+totalTax+ "\nSalary After Tax: " + salaryAfterTax);
        //Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all t
    }
}
