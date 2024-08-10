package concurrency.class326;

import java.util.concurrent.TimeUnit;

public class CachedData {

    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isReady() {
        return flag;
    }

    public static void main(String[] args) {

        CachedData cachedData = new CachedData();

        Thread writerThread = new Thread(() -> {
            try {
                System.out.print("Downloading ");
                for (int i = 0; i < 5; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print(".");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedData.toggleFlag();
            System.out.println("\nDownload completed. Flag set to " + cachedData.isReady());
        });

        Thread readerThread = new Thread(() -> {
            while (!cachedData.isReady()) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    // Busy-wait until flag becomes true
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("File read" + cachedData.isReady());
        });

        writerThread.start();
        readerThread.start();
    }
}
