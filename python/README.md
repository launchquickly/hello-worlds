# hello-world-python
Python hello-world example.

## Points to note

- [Poetry](https://python-poetry.org/) is used as the build and dependency management tool. It replaces the need for 
  requirements.txt and virtualenv management.
- The `pyproject.toml` file defines project metadata, dependencies, and tool configuration (Black, isort, pytest).
- The project uses a `src/` layout (`src/hello_world`) to ensure imports behave the same in development, testing, and 
  packaging environments.
- `poetry install` (or `make install`) creates and manages the virtual environment automatically.
- The application entry point is `main()` in [app.py](/python/src/hello_world/app.py), located under the `hello_world` 
  package.
- `python -m hello_world.app` is used to run the application as a module.
- Command-line arguments are accessed via `sys.argv`.
- Test files are located in the `tests/` directory and follow the `test_*.py` naming convention.
- [pytest](https://docs.pytest.org/) is used as the testing framework.
- [Black](https://black.readthedocs.io/) is used for code formatting.
- [isort](https://pycqa.github.io/isort/) is used to enforce import ordering.
- Python bytecode cache directories (`__pycache__`) are ignored via `.gitignore`.
- Build and development commands are wrapped using a Makefile for consistency across languages.

## Install
- Python 3.14
- Poetry 2.x

## Usage

### Install dependencies

```zsh
make install
```

### Build

Build will run black, isort and test steps prior to building step:
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
