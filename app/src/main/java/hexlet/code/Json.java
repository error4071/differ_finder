package hexlet.code.Formatter;

import hexlet.code.DifferFinder;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Json {
    public static String formatJson(Map<String, Object> file1, Map<String,
            Object> file2, String format) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(DifferFinder.DifferFinder(file1, file2, format));
    }
}

