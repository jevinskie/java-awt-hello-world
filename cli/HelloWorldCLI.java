public class HelloWorldCLI {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        System.getProperties().forEach((k, v) -> { System.out.printf("%s: %s\n", k, v); });
    }
}
