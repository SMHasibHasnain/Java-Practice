package OOP.wrapperClass;

public class two {
    public static void main(String[] args) {

        //number to hex/oct/binary

        int n = 58370;
        String binary = Integer.toHexString(n);
        System.out.println(binary);

        int p = 39304;
        String octal = Integer.toOctalString(p);
        System.out.println(octal);

        int q = 34345;
        String hex = Integer.toHexString(q);
        System.out.println(hex);

        // Decoding

        Integer t = Integer.decode("0xE402");
        System.out.println("Decoded value: " + t);


        // Parsing

        String name = "123";
        int number = Integer.parseInt(name);
        System.out.println(number);

        // Number to String

        Integer h = Integer.valueOf(10);
        String g = Integer.toString(h);
        System.out.println(g);

        // min max value

        System.out.println("Min of int: " + Integer.MIN_VALUE);
        System.out.println("Max of int: " + Integer.MAX_VALUE);

    }
}
