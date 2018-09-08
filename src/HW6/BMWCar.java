package HW6;

public class BMWCar extends GasolineCar {

    public BMWCar(String name, String color, int spead, int price) {
        super(name, color, spead, price);
    }

    public BMWCar(String name, String color, int spead) {
        super(name, color, spead);
    }

    public BMWCar(String name, String color) {
        super(name, color);
    }

    public BMWCar(String name) {
        super(name);
    }


    public void pickUpGirl (){
        System.out.println("Девушка села в машину " + getName() );
    }
}
