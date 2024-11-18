public class toStringMethod {
    int x;
    int y;
    int z;

    public toStringMethod(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "toString [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    public static void main(String[] args) {
        toStringMethod myobj1 = new toStringMethod(3, 4, 2);
        toStringMethod myobj2 = new toStringMethod(9, 4, 2);
        toStringMethod myobj3 = new toStringMethod(1, 0, 3);

        System.out.println(myobj1);


    } 

}
