package HW1213;

public class Writer implements Runnable{

    @Override
    public void run() {
        synchronized (System.out){
        System.out.println(Thread.currentThread().getName() + " Вывод на консоль1");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Вывод на консоль2");
    }
}}
