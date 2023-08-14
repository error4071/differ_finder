package hexlet.code.Formatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import hexlet.code.JsonDiffer;

import java.io.IOException;
import java.util.Map;

public class Json {
    public static String formatJson(Map<String, Object> file1, Map<String,
            Object> file2, String format) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(JsonDiffer.formatJsonDiffer(file1, file2, format));
    }
}