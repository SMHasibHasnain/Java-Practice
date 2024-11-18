class MyClass {
    static int a;
    int x;
    String p;

    MyClass(){
        this("Hamim"); //Must be kept as first
        this.x = 5;
        
    }

    MyClass(String p){
        this.p = p;
    }

}

public class Constructor {
    public static void main(String[] args) {
        MyClass MyClass1 = new MyClass("Hasib");
        System.out.println(MyClass1.p);
        System.out.println(MyClass1.x);

        MyClass MyClass2 = new MyClass();
        System.out.println(MyClass2.p);
        System.out.println(MyClass2.x);
    }    
}


