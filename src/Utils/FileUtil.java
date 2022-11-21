package Utils;

import java.nio.file.Path;

public class FileUtil {

    public static String RESOURECES = "resources";
    public static String CallsIn = "CallsIn.txt";
    public static String CallsOut = "CallsOut.txt";
    public static Path pathCallsIn = Path.of(RESOURECES, CallsIn);
    public static Path pathCallsOut = Path.of(RESOURECES, CallsOut);

    private FileUtil() {
    }
}
