package createThread;

public class CreateByExtendThread extends Thread {
    public void run() {
        System.out.println("Odpalenie nowego wątku");
        for (int i = 0; i < 1000000; ++i) {
            System.out.println("NT: " + i);
        }
    }
}
