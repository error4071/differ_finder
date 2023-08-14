package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DifferTest {
    private static String file1;
    private static String file2;
    private static String file1yml;
    private static String file2yml;
    private static String correctResult;
    private static String PlainCorrectResult;
    private static String JsonCorrectResult;
    private static String YmlCorrectResult;
    private static String defaultFormat;

    @BeforeAll
    public static void beforeAll() throws Exception {
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));
        PlainCorrectResult = Files.readString(Paths.get("./src/test/resources/PlainCorrectResult"));
        JsonCorrectResult = Files.readString(Paths.get("./src/test/resources/JsonCorrectResult"));
        YmlCorrectResult = Files.readString(Paths.get("./src/test/resources/YmlCorrectResult"));
        defaultFormat = "stylish";
    }
    @Test
    public void jsonTestDefault() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2, defaultFormat);
        assertThat(result).isEqualTo(correctResult);
    }
    @Test
    public void jsonTestStylish() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2, "stylish");
        assertThat(result).isEqualTo(correctResult);
    }
    @Test
    public void jsonTestPlain() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2, "plain");
        assertThat(result).isEqualTo(PlainCorrectResult);
    }
    @Test
    public void jsonTestJson() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2, "json");
        assertThat(result).isEqualTo(JsonCorrectResult);
    }
    @Test
    public void ymlTestDefault() throws IOException {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml, defaultFormat);
        assertThat(result).isEqualTo(YmlCorrectResult);
    }
    @Test
    public void ymlTestStylish() throws Exception {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml, "stylish");
        assertThat(result).isEqualTo(YmlCorrectResult);
    }
    @Test
    public void ymlTestPlain() throws Exception {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml, "plain");
        assertThat(result).isEqualTo(PlainCorrectResult);
    }
    @Test
    public void ymlTestJson() throws Exception {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml, "json");
        assertThat(result).isEqualTo(JsonCorrectResult);
    }
}