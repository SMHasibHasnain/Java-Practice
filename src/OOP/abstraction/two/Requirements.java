package OOP.abstraction.two;

public interface Requirements {
    void deposit();
    void withdraw();
    static void balance(){
        System.out.println("My Balance Amount...");
    }
}
