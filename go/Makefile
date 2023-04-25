.DEFAULT_GOAL := build

fmt:
	go fmt ./...
.PHONY:fmt

vet: fmt
	go vet ./...
.PHONY:vet

test: vet
	go test ./...
.PHONY:test

build: test
	go build hello.go
.PHONY:build

run: build
	./hello
.PHONY:run