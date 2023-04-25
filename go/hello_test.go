package main

import (
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestHelloWorld(t *testing.T) {
	t.Run("Default message is `Hello, world!`", func(t *testing.T) {
		got := Hello("")
		want := "Hello, world!"

		assert.Equal(t, want, got)
	})
	t.Run("Say hello to named person", func(t *testing.T) {
		got := Hello("Paul")
		want := "Hello, Paul!"

		assert.Equal(t, want, got)
	})
}
