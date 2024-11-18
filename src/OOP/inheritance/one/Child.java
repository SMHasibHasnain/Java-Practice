package OOP.inheritance.one;

class Child extends Parent {
    String gen;

    public Child(String name, String tribe, String nationality, String gen) {
        super(name, tribe, nationality);
        this.gen = gen;
    }
}