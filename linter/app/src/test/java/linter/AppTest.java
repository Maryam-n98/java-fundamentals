/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static linter.App.linterMessage;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void testEmptyFile() throws IOException {
        Path path = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\java-fundamentals\\linter\\app\\src\\test\\resources\\empty.js");
        assertEquals(0, App.linterMessage(path.toString()));
    }
    @Test
    public void testnoError() throws IOException {
        Path path = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\java-fundamentals\\linter\\app\\src\\test\\resources\\noErrors.js");
        assertEquals(0, App.linterMessage(path.toString()));
    }
    @Test
    public void testoneError() throws IOException {
        Path path = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\java-fundamentals\\linter\\app\\src\\test\\resources\\oneError.js");
        assertEquals(1, App.linterMessage(path.toString()));
    }
    @Test
    public void testFewError() throws IOException {
        Path path = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\java-fundamentals\\linter\\app\\src\\test\\resources\\fewErrors.js");
        assertEquals(3, App.linterMessage(path.toString()));
    }

    @Test
    public void testManyError() throws IOException {
        Path path = Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\java-fundamentals\\linter\\app\\src\\test\\resources\\ manyErrors.js");
        assertEquals(5, App.linterMessage(path.toString()));
    }


}