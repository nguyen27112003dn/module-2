package ss7_abstractclass;

public class main {
    public static void main(String[] args) {
        animal[] animals = new animal[2];
        animals[0] = new chicken();
        animals[1] = new tiger();
        for (animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof chicken) {
                edible edibler = (chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        fruit[] fruits = new fruit[2];
        fruits[0] = new apple();
        fruits[1] = new orange();
        for (fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
