package ss7_abstract_interface.thuc_hanh.animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "mổ thóc";
    }

    public interface Edible {
        String howToEat();
    }

}
