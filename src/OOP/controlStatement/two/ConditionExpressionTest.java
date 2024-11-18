package OOP.controlStatement.two;

//It's allowed to call function as the condition on if/else

public class ConditionExpressionTest {

    static boolean active() {
        return false;
    }

    public static void main(String[] args) {
        if(active()) {
            System.out.println("Activated!");
        } else {
            System.out.println("Deactivated!");
        }
    }
}
