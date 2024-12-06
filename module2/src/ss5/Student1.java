package ss5;

public class Student1 {
    public String name = "John";
    public String classroom = "C02";

    public Student1() {
    }

    public Student1(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1();
        System.out.println("Ten ban dau: " + student1.getName());
        System.out.println("Lop ban dau: " + student1.getClassroom());
        student1.setName("Nguyen");
        student1.setClassroom("C08");
        System.out.println("Ten moi: " + student1.getName());
        System.out.println("Lop moi: " + student1.getClassroom());
    }
}
