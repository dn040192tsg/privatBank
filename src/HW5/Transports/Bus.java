package HW5.Transports;

import HW5.ObjectState;

/**
 * Класс описывающий автобус
 */
public class Bus {

    private String name;
    private ObjectState state = ObjectState.stoping;
    private int stopCount = 0;

    public Bus(String name) {
        this.name = name;

    }

    /**
     * Метод чтобы затормозить автобус
     * @return возвращает остановку
     */
    public String nextStop() {

        if (state == ObjectState.stoping) {
            return "(ошибка) чтобы остановить автобус он сначала должен начать движение";
        }

        setState(ObjectState.stoping);
        stopCount++;

        switch (stopCount) {
            case 1:
                return "Автобус " + name + " остановился на первой остановке Акация";
            case 2:
                return "Автобус " + name + " остановился на второй остановке Азовское море";
            case 3:
                return "Автобус " + name + " остановился на третей остановке Чечня";
            case 4:
                return "Автобус " + name + " остановился на четвертой остановке Зорька";
            case 5:
                stopCount = 0;
                return "Автобус " + name + " остановился на пятой остановке Депо, автобус доехал до конечной";
        }
        return "(ошибка) такой остановки не существует";
    }

    /**
     * Метод чтобы автобус поехал
     * @return возвращает текст
     */
    public String goBus() {

        if (state == ObjectState.goes) {
            return "(ошибка) автобус " + name + "сейчас и так находится в движении";
        }

        setState(ObjectState.goes);

        return "Автобус " + name + " начал движение";
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public ObjectState getState() {
        return state;
    }

    private void setState(ObjectState state) {
        this.state = state;
    }


}
