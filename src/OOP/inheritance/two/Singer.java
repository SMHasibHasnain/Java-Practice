package OOP.inheritance.two;

public class Singer extends Person {
    String popularity;

    void myjob(String popularity) {
        this.popularity = popularity;
        System.out.printf("I'm a %s singer... la la la la...", popularity);
    }
}
