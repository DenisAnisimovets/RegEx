package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    static String regexPhone = "(.*)(\\d{2})([), ,-])?(\\d{3})([ ,-])?(\\d{2})([ ,-])?(\\d{2})(.*)";
    static String regexNumber = "^(\\d*).*";
    public static String getPhoneNumber(String str) {
        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            return "+375(" + matcher.group(2) + ")" + matcher.group(4) + matcher.group(6) + matcher.group(8);
        }

        return "+375121234567";
    }

    public static String getSequenceNumber(String str) {
        Pattern pattern = Pattern.compile(regexNumber);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            return matcher.group(1);
        }
        return "0";
    }
}
