package HW6;

public class ElectroCar extends Car{


    public ElectroCar(String name, String color, int spead, int price) {
        super(name, color, spead, price);
    }

    public ElectroCar(String name, String color, int spead) {
        super(name, color, spead);
    }

    public ElectroCar(String name, String color) {
        super(name, color);
    }

    public ElectroCar(String name) {
        super(name);
    }

    @Override
    public void charge() {
        System.out.println("Машина " + getName() + " заправляется электричеством");
    }

    public void motorType() {
        System.out.println("Машина " + getName() + " имеет электрический двигатель ");
    }

}
