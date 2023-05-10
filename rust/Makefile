.DEFAULT_GOAL := build

fmt:
	cargo fmt
.PHONY:fmt

test: fmt
	cargo test
.PHONY:test

build: test
	cargo build
.PHONY:build

run: build
	cargo run
.PHONY:run