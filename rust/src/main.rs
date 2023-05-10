use std::env;

fn main() {
    let mut args: Vec<String> = env::args().collect();
    let msg;
    if args.len() == 1 {
        msg = hello(String::from(""));
    } else {
        msg = hello(args.remove(1));
    }
    println!("{msg}");
}

fn hello(n: String) -> String {
    if n.len() == 0 {
        return String::from("Hello, world!");
    }
    return format!("Hello, {n}!");
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn default_message_is_hello_world() {
        let expected = "Hello, world!";

        let actual = hello(String::new());

        assert_eq!(expected, actual);
    }

    #[test]
    fn say_hello_to_named_person() {
        let expected = "Hello, Paul!";

        let actual = hello(String::from("Paul"));

        assert_eq!(expected, actual);
    }
}
