public class MessagePrinter {
    // String fields for the title, message, and suffix
    private String title;
    private String message;
    private String suffix;

    // Constructor to initialize the title, message, and suffix
    public MessagePrinter(String title, String message, String suffix) {
        this.title = title;
        this.message = message;
        this.suffix = suffix;
    }

    // Method to print the title and original message
    public void printTitleAndOriginal() {
        System.out.println("Commencing " + title + ": " + message + " " + suffix);
    }

    // Method to print the title and message in uppercase
    public void printTitleAndUppercase() {
        System.out.println("Commencing " + title + ": " + message.toUpperCase() + " " + suffix.toUpperCase());
    }

    // Method to print the title and message in lowercase
    public void printTitleAndLowercase() {
        System.out.println(title + ": " + message.toLowerCase() + " " + suffix.toLowerCase());
    }

    // Method to print the message with a custom prefix
    public void printWithPrefix(String prefix) {
        System.out.println("Commencing " + prefix + " " + title + ": " + message + " " + suffix);
    }

    // Method to print the message with a custom suffix
    public void printWithCustomSuffix(String customSuffix) {
        System.out.println("Message with Custom Suffix: " + title + ": " + message + " " + customSuffix + "Commencing");
    }

    // Main method for testing the MessagePrinter class
    public static void main(String[] args) {
        // Create an instance of MessagePrinter
        MessagePrinter printer = new MessagePrinter("Greeting", "Hello, World!", "Have a great day!");

        // Print the title and message in different formats
        printer.printTitleAndOriginal();
        printer.printTitleAndUppercase();
        printer.printTitleAndLowercase();
        printer.printWithPrefix("Announcement:");
        printer.printWithCustomSuffix("Enjoy!");
    }
}
