package hexlet.code.Formatter;

import java.io.IOException;
import java.util.*;
public class JsonDiffer {
    public static String formatJsonDiffer(Map<String, Object> file1, Map<String, Object> file2, String format) throws IOException {

        List<Map<String, Object>> result = new ArrayList<>();
        Set<String> keysFromFile = new TreeSet<String>(file1.keySet());
        keysFromFile.addAll(file2.keySet());

        for (String key: keysFromFile) {
            Map<String, Object> map = new LinkedHashMap<>();
            if (file1.containsKey(key) && !file2.containsKey(key)) {
                map.put("key", key);
                map.put("oldValue", file1.get(key));
                map.put("status", "removed");
            } else if (!file1.containsKey(key) && file2.containsKey(key)) {
                map.put("key", key);
                map.put("newValue", file2.get(key));
                map.put("status", "added");
            } else if (!Objects.equals(file1.get(key), file2.get(key))) {
                map.put("key", key);
                map.put("oldValue", file1.get(key));
                map.put("newValue", file2.get(key));
                map.put("status", "updated");
            } else {
                map.put("key", key);
                map.put("oldValue", file1.get(key));
                map.put("status", "unchanged");
            }
            result.add(map);
        }
        return result.toString();
    }
}
