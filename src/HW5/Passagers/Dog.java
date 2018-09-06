package HW5.Passagers;

import HW5.ObjectState;
import HW5.Transports.Bus;

/**
 * Класс описывающий собаку
 */
public class Dog {

    private String name;
    private ObjectState state = ObjectState.stoping;
    private Human owner;

    /**
     *
     * @param name - имя псины
     * @param owner - владелец собаки
     */
    public Dog(String name, Human owner) {
        this.name = name;
        this.owner = owner;
    }

    /**
     * Метод для входа в автобус
     * @param busName - имя автобуса
     * @return возвращает текст
     */

    public String enterBus(Bus busName){

        if (state == ObjectState.goes) {
            return "(ошибка) Чтобы войти, нужно сначала выйти из автобуса";
        }

        if (owner.getState() != ObjectState.goes ){
            return "(ошибка) Собака " + name + " не может зайти пока не зашел хозян " + owner.getState();
        }

        setState(ObjectState.goes);

        return "Собака " + name + " вошла в автобус " + busName.getName() ;


    }

    /**
     * Метод для выхода из автобуса
     * @param busName - имя автобуса
     * @return возвращает текст
     */
    public String exitBus(Bus busName) {

        if (state == ObjectState.stoping) {
            return "(ошибка) Чтобы выйти, нужно сначала зайти в автобус";
        }

        if (owner.getState() == ObjectState.goes){
            return "(ошибка) Собака не может выйти пока не вышел хозян " + owner.getName() ;
        }

        setState(ObjectState.stoping);

        return "Собака " + name + " вышла из автобуса " + busName.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ObjectState getState() {
        return state;
    }

    public void setState(ObjectState state) {
        this.state = state;
    }

    public Human getOwnerName() {
        return owner;
    }

    public void setOwnerName(Human ownerName) {
        this.owner = ownerName;
    }
}
