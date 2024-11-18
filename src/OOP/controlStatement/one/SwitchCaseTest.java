//Switch is faster than if else because of Jump Tree.

package OOP.controlStatement.one;

public class SwitchCaseTest {
    public static void main(String[] args) {
        int i = 7;
        switch(i) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Less then 5!");
                break;
            case 5:
                System.out.println("Equal to 5!");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Less than 10!");
                break;
            case 10:
                System.out.println("Equal to 10!");
                break;
        }
    }
}
