package main

import (
	"fmt"
	"os"
)

func Hello(name string) string {
	if name == "" {
		name = "world"
	}
	return fmt.Sprintf("Hello, %s!", name)
}

func main() {
	name := ""
	args := os.Args
	if len(args) > 1 {
		name = args[1]
	}
	fmt.Println(Hello(name))
}
