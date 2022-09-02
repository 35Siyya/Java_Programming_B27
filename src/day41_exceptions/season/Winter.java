package day41_exceptions.season;

public class Winter extends Season{
    public Winter(String name, double highestTemp, double lowestTemp) {
        super("Winter", highestTemp, lowestTemp);
    }

    @Override
    public void activity() {
        super.activity();
        System.out.println("Use Fireplace");
        System.out.println("Code java");
    }
}
/*
Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace
 */
