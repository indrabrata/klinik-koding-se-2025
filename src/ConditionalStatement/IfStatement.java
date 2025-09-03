package ConditionalStatement;

public class IfStatement {
  public static void main(String[] args) {

    // Sample variable for conditions
    int score = 85;
    boolean isPresent = true;

    System.out.println("=== Conditional Statements Demo ===\n");

    // 1. Simple if statement
    System.out.println("1. Simple if Statement");
    if (score >= 90) {
      System.out.println("Excellent! You scored an A.");
    }

    // 2. if-else statement
    System.out.println("\n2. if-else Statement");
    if (score >= 60) {
      System.out.println("You passed the exam.");
    } else {
      System.out.println("Sorry, you failed the exam.");
    }

    // 3. if-else if-else ladder
    System.out.println("\n3. if-else if-else Ladder");
    if (score >= 90) {
      System.out.println("Grade: A");
    } else if (score >= 80) {
      System.out.println("Grade: B");
    } else if (score >= 70) {
      System.out.println("Grade: C");
    } else if (score >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F (Fail)");
    }

    // 4. Nested if statements
    System.out.println("\n4. Nested if Statements");
    if (isPresent) {
      System.out.println("Student was present today.");

      if (score >= 75) {
        System.out.println("  - And has good performance.");
      } else {
        System.out.println("  - But needs improvement.");
      }
    } else {
      System.out.println("Student was absent. Cannot evaluate performance.");
    }

    // Bonus: Complex condition with logical operators
    System.out.println("\n5. Combined Conditions (Logical Operators)");
    if (isPresent && score > 70) {
      System.out.println("Student is active and performing well.");
    } else if (!isPresent || score < 50) {
      System.out.println("Student needs attention.");
    }
  }
}