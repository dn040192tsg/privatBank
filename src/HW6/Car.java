package HW6;

public class Car {


    private String name;
    private String color;
    private int price;
    private int spead;



    public Car(String name, String color, int spead, int price) {
        this.name = name;
        this.color = color;
        this.spead = spead;
        this.price = price;
    }

    public Car(String name, String color, int spead) {
        this.name = name;
        this.color = color;
        this.spead = spead;
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Car(String name) {
        this.name = name;
    }

    public void go (){
        System.out.println("Машина " + getName() + " поехала");
    }

    public void stop (){
        System.out.println("Машина " + getName() + " остановилась");
    }

    public void charge (){
        System.out.println("Машина " + getName() + " заправляется");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpead() {
        return spead;
    }

    public void setSpead(int spead) {
        this.spead = spead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (spead != car.spead) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + spead;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", spead=" + spead +
                '}';
    }
}
