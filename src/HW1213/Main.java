package HW1213;


public class Main {

    public static void main(String[] args) {
        Base b = new Base();

        for (int i = 0; i < 10; i++) {
            new Thread(new Writer(b)).start();
            new Thread(new Reader(b)).start();
        }


    }


}
