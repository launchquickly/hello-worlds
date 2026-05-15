from hello_world.app import build_message


def test_no_args():
    assert build_message([]) == "hello world"


def test_with_arg():
    assert build_message(["Alice"]) == "hello, Alice"
