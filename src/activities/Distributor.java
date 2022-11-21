package activities;

import Utils.CountUtil;
import Utils.FileUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Distributor extends Thread {
    @Override
    public void run() {
        BlockingQueue<CallDispatcher> callDispatchers = new ArrayBlockingQueue<>(2, true, List.of(new CallDispatcher(), new CallDispatcher()));

        int n = 100;

        while(n > 0)
        {

            n--;
            try {
                Files.lines(FileUtil.pathCallsIn).skip(CountUtil.numberOut).peek(
                        m -> {
                            CallDispatcher callDispatcher = null;
                            try {
                                callDispatcher = callDispatchers.take();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            CountUtil.numberOut++;
                            try {
                                callDispatcher.toMakeCall(m);
                            } catch (InterruptedException | IOException e) {
                                e.printStackTrace();
                            }
                            callDispatchers.add(callDispatcher);
                            try {
                                sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }).count();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
