package InputOutput;

public class Output {
  public static void main(String[] args) {

    // Declare some variables to use in output
    String name = "Alice";
    int age = 25;
    double salary = 55000.50;
    char grade = 'A';
    boolean isActive = true;

    System.out.println("=== Examples of Output in Java ===\n");

    // 1. System.out.print() - prints without newline
    System.out.print("1. Output using print(): ");
    System.out.print("Hello ");
    System.out.print("World!");
    System.out.println("\n"); // Add space after

    // 2. System.out.println() - prints with newline
    System.out.println("2. Output using println():");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Active: " + isActive);
    System.out.println(); // Blank line

    // 3. System.out.printf() - formatted output (like C's printf)
    System.out.println("3. Output using printf() - Formatted Output:");

    // %s = String, %d = int/short/byte/long, %f = float/double, %c = char, %b =
    // boolean
    System.out.printf("Name: %s%n", name);
    System.out.printf("Age: %d years old%n", age);
    System.out.printf("Salary: $%,.2f per year%n", salary); // Formats with comma and 2 decimals
    System.out.printf("Grade: %c%n", grade);
    System.out.printf("Status: %s%n", isActive ? "Active" : "Inactive");

    // Multiple values in one printf
    System.out.printf("%nSummary: %s is %d years old, earns $%.2f, and got grade %c.%n",
        name, age, salary, grade);

    // Formatting numbers
    // Tip: Use %.2f to show 2 decimal places, %,.2f to add thousand separators.
    System.out.printf("Formatted number: %08d%n", 123); // Pads with zeros
    System.out.printf("Pi with 3 decimals: %.3f%n", Math.PI);
  }
}