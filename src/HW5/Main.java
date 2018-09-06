package HW5;

import HW5.Passagers.Dog;
import HW5.Passagers.Human;
import HW5.Passagers.PassagerSex;
import HW5.Transports.Bus;

public class Main {

    public static void main(String[] args) {
/**
 * Создаем все обьекты
 */
        Bus bus = new Bus("№ 121");

        Human human1 = new Human("Антон", PassagerSex.male);
        Human human2 = new Human("Ашот", PassagerSex.male);
        Human human3 = new Human("Радик", PassagerSex.male);
        Human human4 = new Human("Аня", PassagerSex.female);
        Human human5 = new Human("Света", PassagerSex.female);

        Dog dog = new Dog("Бакс", human5);

/**
 * 1-я остановка
 */
        System.out.println(bus.goBus());
        System.out.println(bus.nextStop());
/**
 * 2-я остановка
 */
        System.out.println(bus.goBus());
        System.out.println(bus.nextStop());
        System.out.println(human5.enterBus(bus));
        System.out.println(dog.enterBus(bus));
/**
 * 3-я остановка
 */
        System.out.println(bus.goBus());
        System.out.println(bus.nextStop());
/**
 * 4-я остановка
 */

        System.out.println(bus.goBus());
        System.out.println(bus.nextStop());
        System.out.println(human5.exitBus(bus));
        System.out.println(dog.exitBus(bus));
        System.out.println(human1.enterBus(bus));
        System.out.println(human2.enterBus(bus));
        System.out.println(human3.enterBus(bus));
        System.out.println(human4.enterBus(bus));
/**
 * 5-я остановка
 */
        System.out.println(bus.goBus());
        System.out.println(bus.nextStop());
        System.out.println(human1.exitBus(bus));
        System.out.println(human2.exitBus(bus));
        System.out.println(human3.exitBus(bus));
        System.out.println(human4.exitBus(bus));
    }
}
