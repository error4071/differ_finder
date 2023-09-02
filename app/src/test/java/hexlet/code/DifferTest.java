package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class DifferTest {
    private static String file1;
    private static String file2;
    private static String file1yml;
    private static String file2yml;
    private static String correctResult;
    private static String plainCorrectResult;
    private static String jsonCorrectResult;
    private static String ymlCorrectResult;
    private static String defaultFormat;

    @BeforeAll
    public static void beforeAll() throws Exception {
        correctResult = Files.readString(Paths.get("./src/test/resources/correctResult"));
        plainCorrectResult = Files.readString(Paths.get("./src/test/resources/plainCorrectResult"));
        jsonCorrectResult = Files.readString(Paths.get("./src/test/resources/jsonCorrectResult"));
        ymlCorrectResult = Files.readString(Paths.get("./src/test/resources/ymlCorrectResult"));
        defaultFormat = "stylish";
    }
    @Test
    public void jsonTestDefault() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2);
        assertThat(result).isEqualTo(correctResult);
    }
    @Test
    public void jsonTestStylish() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2);
        assertThat(result).isEqualTo(correctResult);
    }
    @Test
    public void jsonTestPlain() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2);
        assertThat(result).isEqualTo(plainCorrectResult);
    }
    @Test
    public void jsonTestJson() throws Exception {
        file1 = "./src/test/resources/json/file1.json";
        file2 = "./src/test/resources/json/file2.json";
        String result = Differ.generate(file1, file2);
        assertThat(result).isEqualTo(jsonCorrectResult);
    }
    @Test
    public void ymlTestDefault() throws Exception {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml);
        assertThat(result).isEqualTo(ymlCorrectResult);
    }
    @Test
    public void ymlTestStylish() throws Exception {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml);
        assertThat(result).isEqualTo(ymlCorrectResult);
    }
    @Test
    public void ymlTestPlain() throws Exception {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml);
        assertThat(result).isEqualTo(plainCorrectResult);
    }
    @Test
    public void ymlTestJson() throws Exception {
        file1yml = "./src/test/resources/yml/file1.yml";
        file2yml = "./src/test/resources/yml/file2.yml";
        String result = Differ.generate(file1yml, file2yml);
        assertThat(result).isEqualTo(jsonCorrectResult);
    }
}
