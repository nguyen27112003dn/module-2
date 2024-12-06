package ss7_abstractclass;

public class chicken extends animal implements edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "Could be fried";
    }
}
