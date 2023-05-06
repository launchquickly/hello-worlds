/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package scot.launchquickly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private App classUnderTest;

    @BeforeEach void init() {
        this.classUnderTest = new App();
    }

    @Test void defaultMessageIsHelloWorld() {
        final var expected = "Hello, world!";

        final var actual = this.classUnderTest.hello(null);

        assertEquals(expected, actual);
    }

    @Test void sayHelloToNamedPerson() {
        final var expected = "Hello, Paul!";

        final var actual = this.classUnderTest.hello("Paul");

        assertEquals(expected, actual);
    }
}
