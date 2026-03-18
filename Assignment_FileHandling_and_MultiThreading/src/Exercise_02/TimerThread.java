package Exercise_02;

public class TimerThread implements Runnable {

    @Override
    public void run() {

        while(true){

            for(int i = 0; i < 5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("10 second wait and Timer Refreshed");
        }
    }

    public static void main(String[] args) {

        TimerThread t = new TimerThread();
        Thread t1 = new Thread(t);

        t1.start();
    }
}
