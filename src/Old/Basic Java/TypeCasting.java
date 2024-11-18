public class TypeCasting {
    public static void main(String[] args) {
        
        //Type Conversion: Implicit (Small to Big)
        System.out.println("Implicit Type Conversion: ");

        byte myByte = 5;

        int myInt = myByte;
        float myFloat = myInt;
        double myDouble = myFloat;

        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);

        //Type Casting: Explicit (Bigger to Smaller)
        System.out.println("Explicit Type Conversion: ");

        double newDouble = 56.7832732873;
        
        float newFloat = (float)newDouble;
        int newInt = (int)newFloat;
        byte newByte = (byte)newInt;

        System.out.println(newFloat);
        System.out.println(newInt);
        System.out.println(newByte);
    }
}
