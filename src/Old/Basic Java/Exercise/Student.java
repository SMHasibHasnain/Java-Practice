public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder();
        myString.append("Student [name = ").append(name).append("; ");
        myString.append("age = ").append(age).append(" ]");
        return myString.toString(); // to return string of StringBuilder String;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Hasib", 22);
        System.out.println(student1);
    }

}
