package HW8;


import java.util.logging.*;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {

        try {
                throw new MyException1();


        } catch (MyException1 myException1) {
            myException1.printStackTrace();
            logger.log(Level.SEVERE, "Отлавливаем исключение " + myException1.getMassege());

        }

        try {
            throw new MyException2();

        } catch (MyException2 myException2) {
            myException2.printStackTrace();
            logger.log(Level.SEVERE, "Отлавливаем исключение " + myException2.getMassege());

        }
    }
}