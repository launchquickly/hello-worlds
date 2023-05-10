# hello-world-rust
Rust hello-world example.

## Points to note
- [cargo](https://doc.rust-lang.org/cargo/) has been used as the build tool. A [Makefile](/rust/Makefile) has also been 
  added that wraps some of the cargo commands.
- the [.gitignore](/rust/.gitignore) file ignores the `target` directory created by cargo.
- [Cargo.toml](/rust/Cargo.toml) is used to manage the configuration of the project, including dependencies.
  configuration
- `fn main()` in file  [main.rs](/rust/src/main.rs) is the entry point for the Rust program.
- Rust source is located under directory `src` and tests are annotated with the `test` attribute.

## Install
- Rustup 1.25.x or higher, to install the rust toolchain
  - rustc
  - cargo
  - rustfmt
  - and other standard tools

## Usage
### Build
Build will run compile and build an executable at `target/debug/hello_world_rust`:
```zsh
cargo build
```

### Test
To run tests:
```zsh
cargo test
```

### Run
Run the application:
```zsh
cargo run
```

## License
Copyright © 2023, Launchquickly Limited. Released under the [Apache 2.0](/LICENSE) License.
