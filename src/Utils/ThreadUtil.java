package Utils;

public class ThreadUtil {
    public static void startThreads(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
