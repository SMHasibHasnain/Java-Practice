class myclass{
    static int a;
    
    int x;
    int y;
    int z;

    public static void testingStaticVariable() {
        System.out.println(myclass.a); //Accessing Static Variable From Static Method Is - Allowed!
        //System.out.println(myclass.x); Accessing NON-Static Variable From Static Method - NOT Allowed!
    }

    void testingNonStaticVariable() {
        System.out.println(a);  //Static Variable From NON-Static Method - Allowed
        System.out.println(x); //NON-Static Variable From Non-Static Method - Allowed
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        //Without creating object, can I access an static variable? - Yes
        myclass.a = 5;
        System.out.println(myclass.a); //Output 5 - Proved

        //Let's create an object bytheway
        myclass myobject1 = new myclass();

        //Can I access static variable from object? -  Yes
        //Does it can remember the previous change (5) ? - Yes
        System.out.println(myobject1.a); //Output 5 - Proved
        //But It's not recommended to access static variables from objects *

        //For Next Test
        myobject1.a = 10;

        //Creating Another Object
        myclass myobject2 = new myclass();

        //If I once change static variable's value, is it changed on every object? - Yes 
        System.out.println(myobject2.a); //Output 10 - Proved
        System.out.println(myclass.a); //Output 10 - Proved
    
    }
}
