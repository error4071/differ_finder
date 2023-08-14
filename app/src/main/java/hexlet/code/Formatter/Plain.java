package hexlet.code.Formatter;

import java.io.IOException;
import java.util.TreeSet;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.List;


public class Plain {
    public static String formatPlain(Map<String, Object> file1, Map<String,
            Object> file2, String format) throws IOException {

        Set<String> keysFromFile = new TreeSet<>(file1.keySet());
        keysFromFile.addAll(file2.keySet());

        String result = "";
        for (String key : keysFromFile) {

            if (!file1.containsKey(key) && (file2.containsKey((key)))) {
                String value = complexValue(file2.get(key));
                result += String.format("Property '" + key + "' was added with value: " + value) + "\n";
            } else if (file1.containsKey(key) && (!file2.containsKey(key))) {
                result += String.format("Property '" + key + "' was removed") + "\n";
            } else if (!Objects.equals(file1.get(key), file2.get(key))) {
                String key1 = complexValue(file1.get(key));
                String key2 = complexValue(file2.get(key));
                result += String.format("Property '" + key + "' was updated. From " + key1 + " to " + key2) + "\n";
            }
        }
        return result.toString().trim();
    }

    public static String complexValue(Object value) {

        if (value == null) {
            return null;
        } else if (value instanceof String) {
            return "'" + value + "'";
        }
        String stringValue = value.toString();

        if (value instanceof Map || value instanceof List) {
            return "[complex value]";
        }
        return stringValue;
    }
}