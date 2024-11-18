package OOP.controlStatement.three;

public class ForEachLoopWithArray01 {
    public static void main(String[] args) {
        boolean flag = false;
        int[] nums = {12, 10, 23, 32, 53, 42, 45, 13, 34};
        for(int i : nums) {
            if(i == 10) {
                System.out.println(i + " is available on the array!");
                flag = true;
            }
        }
        if(!flag) System.out.println("Isn't available on the array!");
    }
}
