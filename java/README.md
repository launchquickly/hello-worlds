# hello-world-java
Java hello-world example.

## Points to note
- [gradle](https://gradle.org/) has been used as the build tool, there are other options such as maven
- the `gradle init --type java-application` command was used to configure and create the skeleton codebase structure,
  gradle setup and other configuration
- only minor changes have been made to generated code in this hello-world-java example
- Kotlin was selected as the language for the gradle DSL to be used for scripting and declaring configuration
- [gradlew](/java/gradlew) wrapper script is used to invoke and manage the gradle setup for this codebase
- the [.gitignore](/java/.gitignore) file ignores the `.gradle` and `app\build` directories used created by gradle
- [app/build.gradle.kts](/java/app/build.gradle.kts) declares the version of Java to use, dependencies and other 
  configuration
- `public static void main(String[] args)` in class 
  [scot.launchquickly.App.java](/java/app/src/main/java/scot/launchquickly/App.java) is the entry point for the Java
  program
- Java source is located under directory `app\src\main\java` and test classes under directory `app\src\test\java`
- test files end with `Test.java` by convention
- the [JUnit 5 ](https://junit.org/junit5/docs/current/user-guide/) testing library has been used to simplify test setup
  and assertions

## Install
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
