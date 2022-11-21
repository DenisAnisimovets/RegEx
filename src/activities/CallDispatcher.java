package activities;

import Utils.Parser;
import Utils.StringUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static Utils.FileUtil.pathCallsOut;
import static java.lang.Thread.sleep;
import static java.nio.file.StandardOpenOption.*;

public class CallDispatcher {
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private static final Random RANDOM = new Random();
    public void toMakeCall(String str) throws InterruptedException, IOException {
        String strOut = Parser.getSequenceNumber(str) + StringUtil.COMMA + LocalDateTime.now().format(formatter) +
                StringUtil.COMMA + Parser.getPhoneNumber(str) + StringUtil.NewString;
        Files.write(pathCallsOut, strOut.getBytes(), CREATE, APPEND);
        sleep(RANDOM.nextInt(5));
    }

}
