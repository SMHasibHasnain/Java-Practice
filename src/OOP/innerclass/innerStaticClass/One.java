package OOP.innerclass.innerStaticClass;

public class One {
    static int outerStaticVar = 20;
    int outerNonStaticVar = 10;
    static class InnerClass {
        public void display() {
            System.out.println(outerStaticVar); //Only can access outer class's instances.
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        One.InnerClass innerClass = new One.InnerClass(); //Static inner class can be instanstiated directly.
        innerClass.display();
    }
}
