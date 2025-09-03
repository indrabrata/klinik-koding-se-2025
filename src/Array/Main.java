package Array;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    // === ARRAY BASICS ===
    System.out.println("=== Array Basics ===");

    // Declare and initialize
    int[] numbers = { 10, 20, 30, 40, 50 };
    String[] names = new String[3]; // fixed size array with default null values

    // Assign values
    names[0] = "Alice";
    names[1] = "Bob";
    names[2] = "Charlie";

    // Access values
    System.out.println("First number: " + numbers[0]);
    System.out.println("Last number: " + numbers[numbers.length - 1]);
    System.out.println("First name: " + names[0]);

    // === ITERATING ARRAYS ===
    System.out.println("\n=== Iterating Arrays ===");

    // For loop
    System.out.println("Using for loop:");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Index " + i + ": " + numbers[i]);
    }

    // Enhanced for loop (for-each)
    System.out.println("\nUsing for-each loop:");
    for (String name : names) {
      System.out.println("Name: " + name);
    }

    // While loop
    System.out.println("\nUsing while loop:");
    int i = 0;
    while (i < numbers.length) {
      System.out.println("numbers[" + i + "] = " + numbers[i]);
      i++;
    }

    // === MULTI-DIMENSIONAL ARRAY ===
    System.out.println("\n=== Multi-Dimensional Array ===");
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
      }
      System.out.println();
    }

    // === ARRAY METHODS ===
    System.out.println("\n=== Array Utility Methods (java.util.Arrays) ===");
    int[] arr = { 5, 3, 9, 1, 7 };

    System.out.println("Original: " + Arrays.toString(arr));

    Arrays.sort(arr); // sort array
    System.out.println("Sorted: " + Arrays.toString(arr));

    int index = Arrays.binarySearch(arr, 7); // binary search
    System.out.println("Index of 7: " + index);

    int[] copy = Arrays.copyOf(arr, arr.length); // copy array
    System.out.println("Copy: " + Arrays.toString(copy));

    Arrays.fill(copy, 0); // fill with a value
    System.out.println("Filled with 0: " + Arrays.toString(copy));
  }
}
