package hexlet.code.Formatter;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Stylish {
    public static String formatStylish(Map<String, Object> filePath1, Map<String,
            Object> filePath2, String format) throws IOException {

        Set<String> keysFromFile = new TreeSet<>(filePath1.keySet());
        keysFromFile.addAll(filePath2.keySet());

        String result = "{\n";
        for (String key : keysFromFile) {
            if (filePath1.containsKey(key) && (!filePath2.containsKey(key))) {
                result += String.format("  - " + key + ": " + filePath1.get(key)) + "\n";
            } else if (!filePath1.containsKey(key) && (filePath2.containsKey((key)))) {
                result += String.format("  + " + key + ": " + filePath2.get(key)) + "\n";
            } else if (!Objects.equals(filePath1.get(key), filePath2.get(key))) {
                result += String.format("  - " + key + ": " + filePath1.get(key) + "\n" + "  + "
 + key + ": " + filePath2.get(key)) + "\n";
            } else {
                result += String.format("    " + key + ": " + filePath1.get(key)) + "\n";
            }
        }
        return result + "}".trim();
    }
}
