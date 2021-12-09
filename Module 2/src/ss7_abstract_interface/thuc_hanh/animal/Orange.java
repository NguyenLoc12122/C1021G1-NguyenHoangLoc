package ss7_abstract_interface.thuc_hanh.animal;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Cam thơm";
    }
}
