package HW6;

public class DewooCar extends GasolineCar {

    public DewooCar(String name, String color, int spead, int price) {
        super(name, color, spead, price);
    }

    public DewooCar(String name, String color, int spead) {
        super(name, color, spead);
    }

    public DewooCar(String name, String color) {
        super(name, color);
    }

    public DewooCar(String name) {
        super(name);
    }

    public void crush (){
        System.out.println("Машина " + getName() + " сломалась посреди дороги");
    }
}
