package HW6;

public class TeslaCar extends ElectroCar {

    public TeslaCar(String name, String color, int spead, int price) {
        super(name, color, spead, price);
    }

    public TeslaCar(String name, String color, int spead) {
        super(name, color, spead);
    }

    public TeslaCar(String name, String color) {
        super(name, color);
    }

    public TeslaCar(String name) {
        super(name);
    }

    public void onAutopilot (){
        System.out.println("Машина " + getName() + " включила автопилот");
    }

    public void offAutopilot (){
        System.out.println("Машина " + getName() + " выключила автопилот");
    }

}
