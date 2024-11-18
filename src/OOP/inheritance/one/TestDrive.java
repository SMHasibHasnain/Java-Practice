package OOP.inheritance.one;

public class TestDrive {
    public static void main(String[] args) {
        Child c1 = new Child("Hasib", "Sardar", "Bangladeshi", "Z");
        System.out.println(c1.name + c1.tribe + c1.nationality + c1.gen);
        System.out.println("Hello");
    }
}