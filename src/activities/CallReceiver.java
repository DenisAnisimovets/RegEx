package activities;

import Utils.CountUtil;
import Utils.FileUtil;
import Utils.StringUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static java.nio.file.StandardOpenOption.*;

public class CallReceiver extends Thread {
    @Override
    public void run() {
        int n = 10;
        while (n > 0) {
            for (String str : StringUtil.getListInCalls()) {
                try {
                    Files.write(FileUtil.pathCallsIn,
                            (String.valueOf(++CountUtil.numberIn) + StringUtil.COMMA + str + StringUtil.NewString).getBytes(StandardCharsets.UTF_8),
                            APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            try {
                n = n - 1;
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
