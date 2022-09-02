package day39_inheritance.people;

public class Employee  extends Person{

    double salary;

    public Employee(String name, int age, double salary){


      // super();//  calls parent constructor with no argument (empty) thats why giving error
       // we'll give  arg inside the parenthesis
        //we'll call super cons. we did not inherited
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
