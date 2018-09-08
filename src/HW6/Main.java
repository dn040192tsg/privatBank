package HW6;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        BMWCar bmwCar = new BMWCar("BMW Series 5", "red", 250, 20000);
        DewooCar dewooCar = new DewooCar("Lanos", "green", 150, 5000);
        //TeslaCar teslaCar = new TeslaCar("Model S", "white", 220, 70000);

        Class tesla = Class.forName("HW6.TeslaCar");
        Constructor constructorTeslaCar = tesla.getDeclaredConstructor( new Class[] {String.class, String.class, int.class, int.class});
        TeslaCar teslaCar = (TeslaCar) constructorTeslaCar.newInstance(new Object[]{"Model S", "white", 220, 70000});



        bmwCar.go();
        bmwCar.stop();
        bmwCar.charge();
        bmwCar.motorType();
        bmwCar.pickUpGirl();

        System.out.println(bmwCar.toString());
        System.out.println(bmwCar.hashCode());


        System.out.println();

        dewooCar.go();
        dewooCar.stop();
        dewooCar.charge();
        dewooCar.motorType();
        dewooCar.crush();

        System.out.println(dewooCar.toString());
        System.out.println(dewooCar.hashCode());

        System.out.println();

        teslaCar.go();
        teslaCar.stop();
        teslaCar.charge();
        teslaCar.motorType();
        teslaCar.onAutopilot();
        teslaCar.offAutopilot();

        System.out.println(teslaCar.toString());
        System.out.println(teslaCar.hashCode());

        System.out.println();

        Car car [] = new Car [] {bmwCar, dewooCar, teslaCar };
        for (Car x : car) {
            x.go();
        }
    }
}
