package ss4_OOP;

public class Student {
    int id;
    String name;
    int age;
    String address;
    float point;

    public Student(int id, String name, int age, String address, float point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
    }

    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void study() {
        System.out.println(name + " dang di hoc");
    }

    public void displayRank() {
        if (this.point >= 8.0) {
            System.out.println("hoc sinh gioi");
        } else if (this.point >= 6.5) {
            System.out.println("hoc sinh kha");
        } else if (this.point >= 5) {
            System.out.println("hoc sinh trung binh");
        } else {
            System.out.println("hoc sinh yeu");
        }
    }

    @Override
    public String toString() {
        return "Student id: " + id + ", name: " + name + ", age: " + age + ", address: " + address + ", point: " + point;
    }
}
