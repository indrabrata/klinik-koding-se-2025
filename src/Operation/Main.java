package Operation;

public class Main {
  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    // Arithmetic Operators
    System.out.println("=== Arithmetic Operators ===");

    System.out.println("a = " + a + ", b = " + b);
    System.out.println("a + b = " + (a + b)); // Addition
    System.out.println("a - b = " + (a - b)); // Subtraction
    System.out.println("a * b = " + (a * b)); // Multiplication
    System.out.println("a / b = " + (a / b)); // Division (integer)
    System.out.println("a % b = " + (a % b)); // Modulus (remainder)
    System.out.println("a++ = " + (a++)); // Post-increment
    System.out.println("a after increment: " + a);
    System.out.println("++b = " + (++b)); // Pre-increment

    // Relational Operators
    System.out.println("\n=== Relational Operators ===");
    System.out.println("a == b: " + (a == b)); // Equal to
    System.out.println("a != b: " + (a != b)); // Not equal to
    System.out.println("a > b: " + (a > b)); // Greater than
    System.out.println("a < b: " + (a < b)); // Less than
    System.out.println("a >= b: " + (a >= b)); // Greater than or equal
    System.out.println("a <= b: " + (a <= b)); // Less than or equal

    // Logical (Boolean) Operators
    System.out.println("\n=== Logical Operators ===");
    boolean x = true;
    boolean y = false;
    System.out.println("x = " + x + ", y = " + y);
    System.out.println("x && y: " + (x && y)); // Logical AND
    System.out.println("x || y: " + (x || y)); // Logical OR
    System.out.println("!x: " + (!x)); // Logical NOT

    // Bitwise Operators
    System.out.println("\n=== Bitwise Operators ===");
    int p = 6; // Binary: 110
    int q = 4; // Binary: 100
    System.out.println("p = " + p + " (binary: " + Integer.toBinaryString(p) + ")");
    System.out.println("q = " + q + " (binary: " + Integer.toBinaryString(q) + ")");
    System.out.println("p & q = " + (p & q) + " (AND)"); // Bitwise AND
    System.out.println("p | q = " + (p | q) + " (OR)"); // Bitwise OR
    System.out.println("p ^ q = " + (p ^ q) + " (XOR)"); // Bitwise XOR
    System.out.println("~p = " + (~p) + " (NOT)"); // Bitwise NOT
    System.out.println("p << 1 = " + (p << 1) + " (Left shift)");
    System.out.println("q >> 1 = " + (q >> 1) + " (Right shift)");
    System.out.println("p >>> 1 = " + (p >>> 1) + " (Unsigned right shift)");

    // String Comparison
    System.out.println("\n=== String Comparison ===");
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "Hello";
    String str4 = "hello";

    System.out.println("str1 = \"" + str1 + "\"");
    System.out.println("str2 = \"" + str2 + "\"");
    System.out.println("str3 = new String(\"Hello\")");
    System.out.println("str4 = \"" + str4 + "\"");

    System.out.println("\nUsing == operator:");
    System.out.println("str1 == str2: " + (str1 == str2)); // true (same reference in string pool)
    System.out.println("str1 == str3: " + (str1 == str3)); // false (different object in heap)

    System.out.println("\nUsing .equals() method:");
    System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
    System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
    System.out.println("str1.equals(str4): " + str1.equals(str4)); // false (case-sensitive)

    System.out.println("\nUsing .equalsIgnoreCase():");
    System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4)); // true

    System.out.println("\nUsing .compareTo():");
    System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0 (equal)
    System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative (case-sensitive difference)
    System.out.println("str1.compareTo(\"Hellz\"): " + str1.compareTo("Hellz")); // negative ('o' < 'z')
  }
}