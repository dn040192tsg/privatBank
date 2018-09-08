package HW6;

public class GasolineCar extends Car{

    public GasolineCar(String name, String color, int spead, int price) {
        super(name, color, spead, price);
    }

    public GasolineCar(String name, String color, int spead) {
        super(name, color, spead);
    }

    public GasolineCar(String name, String color) {
        super(name, color);
    }

    public GasolineCar(String name) {
        super(name);
    }

    @Override
    public void charge() {
        System.out.println("Машина " + getName() + " заправляется бензином");
    }

    public void motorType() {
        System.out.println("Машина " + getName() + " имеет двигатель внутреннего сгорания");
    }
}
