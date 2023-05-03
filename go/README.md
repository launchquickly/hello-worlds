# hello-world-go
Go hello-world example.

## Points to note
- [Makefile](/go/Makefile)s are commonly used to wrap Go commands such as build, fmt and test
- the [.gitignore](/go/.gitignore) file ignores the executable file `hello` that is the output of the build command
- [go.mod](/go/go.mod) declares the module path, version of Go the codebase is compatible with and dependencies
- `func main()` in `package main` of [hello.go](/go/hello.go) is the entry point for a Go program
- test files typically reside in the same directory as the code they test
- test files end with `_test.go` by convention
- the [testify](https://github.com/stretchr/testify) testing library has been used to simplify the test assertions

## Install
- Golang 1.20

## Usage
### Build
Build will run fmt, vet and test steps prior to building step:
```zsh
make build
```

### Test
To run tests:
```zsh
make test
```

### Run
Run the application:
```zsh
make run
```

## License
Copyright © 2023, Launchquickly Limited. Released under the [Apache 2.0](/LICENSE) License.
