package ss5;

public class Car {
    private String name;
    private String engine;
    public static int numberofCar;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberofCar++;
    }

    void display() {
        System.out.println("Number of car: " + numberofCar + ", Name: " + name + ", Engine: " + engine);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini", "V12");
        car1.display();
        Car car2 = new Car("Ferrari", "V6");
        car2.display();
        Car car3 = new Car("Bugatti", "W16");
        car3.display();
    }
}
