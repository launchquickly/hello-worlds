.PHONY: build clean fmt install lint run test

build: fmt lint test
	poetry build

clean:
	rm -rf dist .pytest_cache .mypy_cache
	find . -type d -name "__pycache__" -exec rm -rf {} +

fmt:
	poetry run isort src tests
	poetry run black src tests

install:
	poetry sync

lint:
	poetry run black --check src tests
	poetry run isort --check-only src tests

run:
	poetry run python -m hello_world.app $(ARGS)

test:
	poetry run pytest
