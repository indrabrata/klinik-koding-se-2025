package Looping;

public class Main {
  public static void main(String[] args) {

    // === FOR LOOP ===
    System.out.println("=== For Loop ===");
    for (int i = 1; i <= 5; i++) {
      System.out.println("Iteration: " + i);
    }

    // === WHILE LOOP ===
    System.out.println("\n=== While Loop ===");
    int j = 1;
    while (j <= 5) {
      System.out.println("Count: " + j);
      j++;
    }

    // === DO-WHILE LOOP ===
    System.out.println("\n=== Do-While Loop ===");
    int k = 1;
    do {
      System.out.println("Step: " + k);
      k++;
    } while (k <= 5);

    // === ENHANCED FOR LOOP (For-Each) ===
    System.out.println("\n=== Enhanced For Loop (Array) ===");
    String[] fruits = { "Apple", "Banana", "Cherry" };
    for (String fruit : fruits) {
      System.out.println("Fruit: " + fruit);
    }

    // === NESTED LOOP ===
    System.out.println("\n=== Nested Loop (Multiplication Table) ===");
    for (int row = 1; row <= 3; row++) {
      for (int col = 1; col <= 3; col++) {
        System.out.print((row * col) + "\t");
      }
      System.out.println();
    }

    // === BREAK ===
    System.out.println("\n=== Break in Loop ===");
    for (int x = 1; x <= 10; x++) {
      if (x == 5) {
        System.out.println("Stopped at " + x);
        break;
      }
      System.out.println("x = " + x);
    }

    // === CONTINUE ===
    System.out.println("\n=== Continue in Loop ===");
    for (int y = 1; y <= 5; y++) {
      if (y == 3) {
        System.out.println("Skip " + y);
        continue;
      }
      System.out.println("y = " + y);
    }

    // === INFINITE LOOP WITH BREAK ===
    System.out.println("\n=== Infinite Loop with Break ===");
    int counter = 0;
    while (true) {
      counter++;
      if (counter == 3) {
        System.out.println("Breaking infinite loop at counter = " + counter);
        break;
      }
    }
  }
}
