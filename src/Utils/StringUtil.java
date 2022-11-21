package Utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    public static final String COMMA;
    public static List<String> listInCalls;
    public static String NewString;

    public static List<String> getListInCalls() {
        return listInCalls;
    }

    static {
        COMMA = ",";
        NewString = "\n";
        listInCalls = new ArrayList<>();
        listInCalls.add("2021-09-13T10:15:30, Иванов Иван, +375 29 999 78 90, Не включается свет");
        listInCalls.add("2021-12-22T11:38:16, Петров Петр, +375257777765, Почему опять не работает интернет?");
        listInCalls.add("2021-12-28T06:55:24, Петров Петр, 333652193, Кто-то оборвал мне телефонный кабель");
        listInCalls.add("2021-12-28T06:55:24, Петров Петр, 33-365-21-93, Кто-то оборвал мне телефонный кабель");
        listInCalls.add("2021-12-28T06:55:24, Петров Петр, (33)365-21-93, Кто-то оборвал мне телефонный кабель");
    }



}
