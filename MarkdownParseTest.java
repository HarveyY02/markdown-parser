import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class MarkdownParseTest {

    //  @Test
    // public void newtestCorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    // }

    //  @Test
    // public void test2CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test3.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }
    //  @Test
    // public void test3CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test3.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfileCorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile2CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file2.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile3CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file3.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile4CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file4.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile5CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file5.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile6CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file6.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("page.com"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile7CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file7.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of(), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile8CorrectLinks() throws IOException {
    //     Path fileName = Path.of("test-file8.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(content));
    // }

    // @Test
    // public void testfile2() throws IOException {
    //     Path fileName = Path.of("test-file2.md");
    //     String content = Files.readString(fileName);
    //     assertEquals(List.of("https://something.com", "some-thing.html"), 
    //     MarkdownParse.getLinks(content));
    // }


    @Test
    public void snippet1() throws IOException {
        Path fileName = Path.of("snippet1.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"), 
    MarkdownParse.getLinks(content));
    }

    @Test
    public void snippet2() throws IOException {
        Path fileName = Path.of("snippet2.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("a.com)", "a.com(())", "example.com"), 
    MarkdownParse.getLinks(content));
    }

    @Test
    public void snippet3() throws IOException {
        Path fileName = Path.of("snippet3.md");
        String content = Files.readString(fileName);
        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"), 
    MarkdownParse.getLinks(content));
    }

}