package ss5;

public class Student {
    private int id;
    private String name;
    private static String college = "GymCode";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void change() {
        college = "CodeGym";
    }

    void display() {
        System.out.println(id + ", " + name + ", " + college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1, "Dang");
        s1.display();
        Student s2 = new Student(2, "Hai");
        s2.display();
        Student s3 = new Student(3, "Phu");
        s3.display();
        Student s4 = new Student(4, "Nguyen");
        s4.display();
    }
}
