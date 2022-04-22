import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() throws IOException {
        List<String> expected = List.of("https://something.com", "some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> result = MarkdownParse.getLinks(content);
        assertEquals(expected, result);
    }
}