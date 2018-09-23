package HW9;

public class Main {

    public static void main(String[] args) {

        Box <Tea> box = new Box();

        BlackTea blackTea = new BlackTea("Батик");
        box.putTarget(blackTea);
        box.getTarget(blackTea);

        GreenTea greenTea = new GreenTea("Гриинфилд");
        box.putTarget(greenTea);
        box.getTarget(greenTea);

        for (Tea x : box.getBoxPlace()) {
            System.out.println(x.getName());
            System.out.println(x.getClass());
        }
    }
}
