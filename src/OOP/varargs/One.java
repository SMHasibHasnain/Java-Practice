package OOP.varargs;

public class One {

    public static int addWithArrays(int p, int q, int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;;
        }
        return sum;
    }

    //variables arguments: accepts any numbers of arguments
    public static int addWithVarargs (int a, int b, int... c) {
        int sum = a + b;
        for (int i : c) {
            sum += i;
        }
        return sum;
    }

    public static void main(String... args) {
        System.out.println(addWithArrays( 3, 5, new int[]{1, 2, 3}));
        System.out.println(addWithVarargs(10, 11, 1, 2, 3));
    }
}
