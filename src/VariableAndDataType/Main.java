package VariableAndDataType;

public class Main {
  public static void main(String[] args) {

    // 🟢 Primitive Data Types (8 types)
    // Stored directly in memory (stack), hold actual values

    byte age = 25; // 1 byte: -128 to 127
    short score = 950; // 2 bytes: -32,768 to 32,767
    int population = 1000000; // 4 bytes: -2B to 2B
    long distance = 150000000l; // 8 bytes: large numbers (L suffix)

    float price = 19.99f; // 4 bytes: decimal (f suffix)
    double salary = 55000.50d; // 8 bytes: more precise decimal
    char grade = 'A'; // 2 bytes: single character
    boolean isActive = true; // true or false

    // 🔹 Display primitive values
    System.out.println("=== Primitive Data Types ===");
    System.out.println("Age (byte): " + age);
    System.out.println("Score (short): " + score);
    System.out.println("Population (int): " + population);
    System.out.println("Distance (long): " + distance);
    System.out.println("Price (float): " + price);
    System.out.println("Salary (double): " + salary);
    System.out.println("Grade (char): " + grade);
    System.out.println("Active (boolean): " + isActive);

    // 🔵 Non-Primitive Data Types (Reference Types)
    // Stored in heap, variable holds a reference to the object
    // Can be null, have methods, and support OOP features

    String name = "Alice Johnson"; // String object
    int[] numbers = { 1, 2, 3, 4, 5 }; // Array of integers
    Person person = new Person("Bob", 30); // Custom object
    String[] hobbies = { "Reading", "Gaming" }; // Array of strings

    // 🔹 Display non-primitive values
    System.out.println("\n=== Non-Primitive Data Types ===");
    System.out.println("Name (String): " + name);
    System.out.println("First number (array): " + numbers[0]);
    System.out.println("Person (Object): " + person.getName() + ", Age: " + person.getAge());
    System.out.println("Hobby (array element): " + hobbies[1]);

    // ✅ Demonstrating methods (only available in non-primitives)
    System.out.println("Name length: " + name.length());
    System.out.println("Uppercase name: " + name.toUpperCase());

    // ✅ Can be null
    String emptyString = null;
    System.out.println("Null check: " + (emptyString == null));
  }
}

// A simple class to demonstrate non-primitive type (object)
class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}