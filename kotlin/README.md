# hello-world-kotlin
Kotlin hello-world example.

## Points to note
- [gradle](https://gradle.org/) has been used as the build tool, there are other options such as maven
- the `gradle init --type kotlin-application` command was used to configure and create the skeleton codebase structure,
  gradle setup and other configuration
- only minor changes have been made to generated code in this hello-world-kotlin example
- Naturally, Kotlin was selected as the language for the gradle DSL to be used for scripting and declaring configuration
- [gradlew](/kotlin/gradlew) wrapper script is used to invoke and manage the gradle setup for this codebase
- the [.gitignore](/kotlin/.gitignore) file ignores the `.gradle` and `app\build` directories required by gradle
- [app/build.gradle.kts](/kotlin/app/build.gradle.kts) declares the version of Kotlin to use, dependencies and other 
  configuration
- `fun main(args: Array<String>)` in file 
  [scot.launchquickly.App.kt](/kotlin/app/src/main/kotlin/scot/launchquickly/App.kt) is the entry point for the Kotlin 
  program, it is not necessary in this case to declare a class, even though classes are available in Kotlin. There is 
  also a form which does not require args: `fun main()`
- Kotlin source is located under directory `app\src\main\kotlin` and test classes under directory `app\src\test\kotlin`
- test files end with `Test.kt` by convention
- the Kotlin [JUnit 5 ](https://junit.org/junit5/docs/current/user-guide/) testing library integration has been used to 
  simplify test setup and assertions

## Install
- Kotlin 1.8.x
- OpenJDK 1.17
- Gradle 8.x

## Usage
### Build
Build will run compile, create the jar, test and check tasks, prior to completing the build task:
```zsh
./gradlew build
```

### Test
To run tests:
```zsh
./gradlew test
```

### Run
Run the application:
```zsh
./gradlew run
```

## License
Copyright © 2023, Launchquickly Limited. Released under the [Apache 2.0](/LICENSE) License.
