/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package scot.launchquickly

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {

    @Test fun defaultMessageIsHelloWorld() {
        val expected = "Hello, world!"

        val actual = hello()

        assertEquals(expected, actual)
    }

    @Test fun sayHelloToNamedPerson() {
        val expected = "Hello, Paul!"

        val actual = hello("Paul")

        assertEquals(expected, actual)
    }
}
