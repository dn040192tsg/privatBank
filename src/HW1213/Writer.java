package HW1213;

public class Writer implements Runnable {

    Base b = null;

    public Writer(Base b) {
        this.b = b;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            b.myQueue.offer(Thread.currentThread().getName() + " добавил запись " +  i + " в стєк " );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}