public class Course {
    static int maxCapacity = 100;
    static int numberOfCourses;
    String courseName;
    int enrolledStudents;
    String[] enrollStudent;

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollStudent = new String[maxCapacity];
        numberOfCourses++;
    }

    public static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }


    void enrollStudent(String studentName) {
        this.enrollStudent[enrolledStudents] = studentName;
        System.out.println("Student Has Been Enrolled!");
        enrolledStudents++;
    }

    void unenrollStudent(String studentName) {
        System.out.println("Student Has Been Unenrolled!");
        enrolledStudents--;
        //Incomplete
    }

    int getEnrolledStudents() {
        return enrolledStudents;
    }

    public static void main(String[] args) {
        System.out.println(numberOfCourses);
        Course english = new Course("English");
        Course bangla = new Course("Bangla");
        Course math = new Course("Math");
        System.out.println(numberOfCourses);
        english.enrollStudent("Hasib");
        english.enrollStudent("Hamim");
        System.out.println(english.getEnrolledStudents());
        english.unenrollStudent("Hasib");
        System.out.println(bangla.getEnrolledStudents());
    }

}
