package hexlet.code;

import hexlet.code.Formatter.Json;
import hexlet.code.Formatter.Plain;
import hexlet.code.Formatter.Stylish;

import java.io.IOException;
import java.util.Map;


public class Format {
    public static String formatStyle(Map<String, Object> filePath1, Map<String,
            Object> filePath2, String format) throws IOException {
        switch (format) {
            case "stylish":
                return Stylish.formatStylish(filePath1, filePath2, format);
            case "plain":
                return Plain.formatPlain(filePath1, filePath2, format);
            case "json":
                return Json.formatJson(filePath1, filePath2, format);
            default:
                throw new Error("Unknown format: " + format);
        }
    }
}

