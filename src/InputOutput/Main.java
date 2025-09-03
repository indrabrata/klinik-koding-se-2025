package InputOutput;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // BufferReader is other way to read from input, but for now we can just use
    // Scanner class
    // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    Scanner sc = new Scanner(System.in);

    System.out.println("=== Enter your details ===");

    // Read String (non-primitive, but commonly used with input)
    System.out.print("Enter your name: ");
    String name = sc.nextLine();

    // Primitive data types
    System.out.print("Enter your age (int): ");
    int age = sc.nextInt();

    System.out.print("Enter your height (double): ");
    double height = sc.nextDouble();

    System.out.print("Enter your grade (char) - single letter: ");
    char grade = sc.next().charAt(0); // Read first character

    System.out.print("Do you have a scholarship? (true/false): ");
    boolean hasScholarship = sc.nextBoolean();

    System.out.print("Enter your score (short): ");
    short score = sc.nextShort();

    System.out.print("Enter population of city (long): ");
    long population = sc.nextLong();

    System.out.print("Enter temperature (float): ");
    float temperature = sc.nextFloat();

    System.out.print("Enter number of books (byte): ");
    byte books = sc.nextByte();

    // Close scanner
    sc.close();

    // Display output
    System.out.println("\n=== Your Information ===");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height + " cm");
    System.out.println("Grade: " + grade);
    System.out.println("Scholarship: " + hasScholarship);
    System.out.println("Score: " + score);
    System.out.println("City Population: " + population);
    System.out.println("Temperature: " + temperature + " °C");
    System.out.println("Number of Books: " + books);
  }
}
