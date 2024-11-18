package OOP.inheritance.two;

public class Person {
    String name;
    String nationalID;

    public void profile(String name, String nationalID) {
        this.name = name;
        this.nationalID = nationalID;
        System.out.printf("My name is: %s. \n", name);
        System.out.printf("My national id is: %s. \n", nationalID);
    }
}
