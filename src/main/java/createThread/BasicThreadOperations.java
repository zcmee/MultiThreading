package createThread;

public class BasicThreadOperations {

    public static void main(String[] args) {
        Thread createByExtendThread = new CreateByExtendThread();
        createByExtendThread.start();
//        createByExtendThread.start(); //czemu podwójne wywołanie wątku powoduje zabicie innych

        Thread createdByImplementsRunnable = new Thread(new CreatedByImplementsRunnable());
        createdByImplementsRunnable.start();
//        Tworzenie za pomocą klasy anonimowej
        Thread createdByAnonymousImplementsRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; ++i) {
                    System.out.println("Anonimowa runnable dluza" + i);
                }
            }
        });
        createdByAnonymousImplementsRunnable.start();

        //interfejs runnabl;e jest interfejsem funkyjnym
        Thread createdByAnonymousImplementsRunnableVersion8 = new Thread(() -> {
            for (int i = 0; i < 1000000; ++i) {
                System.out.println("XXX Anonimowa runnable Krotka XXXX" + i);
            }
        });
        createdByAnonymousImplementsRunnableVersion8.start();


        for(int i = 0; i < 1000000; ++i) {
            System.out.println("OT: " + i);
        }
    }

}
