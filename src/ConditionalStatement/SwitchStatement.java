package ConditionalStatement;

public class SwitchStatement {
  public static void main(String[] args) {

    System.out.println("=== Switch Statement Demo ===\n");

    // 1. Switch with int (e.g., menu selection)
    System.out.println("1. Switch with Integer (Menu Example)");
    int choice = 2;

    switch (choice) {
      case 1:
        System.out.println("You selected: Home");
        break;
      case 2:
        System.out.println("You selected: Profile");
        break;
      case 3:
        System.out.println("You selected: Settings");
        break;
      case 4:
        System.out.println("You selected: Messages");
        break;
      default:
        System.out.println("Invalid choice: Please select 1-4");
        break;
    }

    // 2. Switch with String (e.g., day of the week)
    System.out.println("\n2. Switch with String (Day Checker)");
    String day = "Friday";

    switch (day) {
      case "Saturday":
      case "Sunday":
        System.out.println(day + " is a Weekend!");
        break;
      case "Friday":
        System.out.println(day + " is a Party day!");
        break;
      case "Monday":
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
        System.out.println(day + " is a Weekday.");
        break;
      default:
        System.out.println("Unknown day: '" + day + "'");
        break;
    }

    // 3. Switch without break (Fall-through example)
    System.out.println("\n3. Switch Without Break (Fall-through)");
    int value = 1;

    switch (value) {
      case 1:
        System.out.println("Case 1: No break, so it falls through");
      case 2:
        System.out.println("Case 2: Also executed because no break in case 1");
      case 3:
        System.out.println("Case 3: This will also run");
        break;
      default:
        System.out.println("Default case");
        break;
    }

    // 4. Switch Expression (Java 14+) - Using 'yield' and arrow syntax
    System.out.println("\n4. Switch Expression (Modern Java - Arrow Syntax)");
    int month = 3;
    String season = switch (month) {
      case 12, 1, 2 -> "Winter";
      case 3, 4, 5 -> "Spring";
      case 6, 7, 8 -> "Summer";
      case 9, 10, 11 -> "Autumn";
      default -> {
        System.out.println("Invalid month!");
        yield "Unknown";
      }
    };
    System.out.println("Month " + month + " is in " + season);

  }
}