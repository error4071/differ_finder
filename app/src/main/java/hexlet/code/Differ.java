package hexlet.code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;


public class Differ {
    public static Path getAbsolutePath(String filePath) {
        return Paths.get(filePath).toAbsolutePath().normalize();
    }

    public static String getInfo(String filePath) throws Exception {
        return Files.readString(getAbsolutePath(filePath));
    }

    public static String getExtension(String filePath) {
        return filePath.substring(filePath.lastIndexOf(".") + 1);
    }

        private static Map getData(String filePath) throws Exception {
        Path fullPath = getAbsolutePath(filePath);

        if (!Files.exists(fullPath)) {
            throw new Exception("File '" + fullPath + "' does not exist");
        }

        String content = Files.readString(fullPath);
        String dataFormat = getExtension(filePath);

        return Parser.parser(content, dataFormat);
    }

    public static String generate(String filePath1, String filePath2) throws Exception {
        return generate(filePath1, filePath2);
    }
}
