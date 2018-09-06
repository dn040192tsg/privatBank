package HW5.Passagers;

import HW5.ObjectState;
import HW5.Transports.Bus;

/**
 * Класс описывающий человека
 */
public class Human {

    private String name;
    private PassagerSex sex;
    private ObjectState state = ObjectState.stoping;


    /**
     * Конструктор класса
     * @param name - имя человека
     * @param sex - пол
     */
    public Human(String name, PassagerSex sex) {
        this.name = name;
        this.sex = sex;
    }

    /**
     *
     * @param busName - имя автобуса
     * @return возвращает текст
     */
    public String enterBus(Bus busName) {

        if(state == ObjectState.goes){
            return "(ошибка) Чтобы войти, нужно сначала выйти из автобуса";
        }

        setState(ObjectState.goes);

        if (sex == PassagerSex.male) {
            return "Мужчина " + name + " вошел в автобус " + busName.getName();
        } else if (sex == PassagerSex.female) {
            return "Женьщина " + name + " вошла в автобус " + busName.getName();
        } else {
            return "Человек " + name + " вошел в автобус " + busName.getName();
        }

    }

    /**
     * Выход из автобуса
     * @param busName - имя автобуса
     * @return возвращает текст
     */
    public String exitBus(Bus busName) {

        if(state == ObjectState.stoping){
            return "(ошибка) Чтобы выйти, нужно сначала зайти в автобус";
        }

        setState(ObjectState.stoping);

        if (sex.equals("male")) {
            return "Мужчина " + name + " вышел из автобуса " + busName.getName();
        } else if (sex.equals("fmale")) {
            return "Женьщина " + name + " вышла из автобуса " + busName.getName();
        } else {
            return "Человек " + name + " вышел из автобуса " + busName.getName();
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public PassagerSex getSex() {
        return sex;
    }

    private void setSex(PassagerSex sex) {
        this.sex = sex;
    }
    public ObjectState getState() {
        return state;
    }

    private void setState(ObjectState state) {
        this.state = state;
    }
}
