//Direct string works well as an expression in java;

package OOP.controlStatement.one;

public class SwitchExpressionTest {
    public static void main(String[] args) {
        //String name = "Suman";
        switch("Hasib") {
            case "Suman":
                System.out.println("Not actually");
                break;
            case "Hasib":
                System.out.println("Right, he is!");
                break;
            default:
                System.out.println("Not correct");
                break;
        }
    }
}
