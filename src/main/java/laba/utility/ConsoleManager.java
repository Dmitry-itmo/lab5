package laba.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * The class that reads the console
 */
public class ConsoleManager {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            return reader.readLine();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
