/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package scot.launchquickly

fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println(hello(args[0]))
    } else {
        println(hello())
    }
}

fun hello(name: String = "world"): String {
    return "Hello, $name!"
}