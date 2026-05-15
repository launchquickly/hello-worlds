import sys


def build_message(args: list[str]) -> str:
    if not args:
        return "hello world"
    return f"hello, {args[0]}"


def main() -> None:
    message = build_message(sys.argv[1:])
    print(message)


if __name__ == "__main__":
    main()
