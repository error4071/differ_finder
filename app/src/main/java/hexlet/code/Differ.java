package hexlet.code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;


public class Differ {
    public static Path getAbsolutePath(String filePath) {
        return Paths.get(filePath).toAbsolutePath().normalize();
    }

    public static String getData(String filePath) throws Exception {
        return Files.readString(getAbsolutePath(filePath));
    }

    public static String getExtension(String filePath) {
        return filePath.substring(filePath.lastIndexOf(".") + 1);
    }

    public static String generate(String filePath1, String filePath2, String format) throws Exception {
        String data1 = getData(filePath1);
        String data2 = getData(filePath2);

        String content1 = getExtension(filePath1);
        String content2 = getExtension(filePath2);

        Map<String, Object> map1 = Parser.parser(data1, content1);
        Map<String, Object> map2 = Parser.parser(data2, content2);

	return Format.formatStyle(map1, map2, format).trim();
    }
    public static String generate(String filePath1, String filePath2) throws Exception {
        return generate(filePath1, filePath2, "stylish");
    }
}
