package HW1213;

public class Reader implements Runnable{

    Base b = null;

    public Reader(Base b) {
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (System.out) {
            while (true) {
                if (b.myQueue.peek () == null) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println(b.myQueue.poll());
                }
            }
        }


    }
    }


