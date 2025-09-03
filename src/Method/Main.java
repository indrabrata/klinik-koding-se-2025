package Method;

public class Main {
  public static void main(String[] args) {

    System.out.println("=== Methods in Java ===");

    // 1. Simple method (no parameter, no return)
    sayHello();

    // 2. Method with parameters
    greet("Alice");
    greet("Bob");

    // 3. Method with return value
    int sum = add(5, 7);
    System.out.println("Sum of 5 + 7 = " + sum);

    // 4. Method with multiple return scenarios
    String grade = getGrade(85);
    System.out.println("Grade for score 85: " + grade);

    // 5. Method overloading (same name, different parameters)
    System.out.println("\n=== Method Overloading ===");
    System.out.println("add(2, 3) = " + add(2, 3));
    System.out.println("add(2.5, 3.7) = " + add(2.5, 3.7));

    // 6. Static vs Instance method
    System.out.println("\n=== Static vs Instance Method ===");
    Person person = new Person("Charlie", 30);
    person.introduce(); // instance method
    Person.sayType(); // static method
  }

  // 1. Simple method
  public static void sayHello() {
    System.out.println("Hello, world!");
  }

  // 2. Method with parameters
  public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
  }

  // 3. Method with return value
  public static int add(int a, int b) {
    return a + b;
  }

  // 4. Method with logic & return
  public static String getGrade(int score) {
    if (score >= 90)
      return "A";
    else if (score >= 80)
      return "B";
    else if (score >= 70)
      return "C";
    else
      return "D";
  }

  // 5. Overloaded method (different parameter type)
  public static double add(double a, double b) {
    return a + b;
  }
}

// Extra class to demonstrate instance & static methods
class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Instance method
  public void introduce() {
    System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
  }

  // Static method
  public static void sayType() {
    System.out.println("I am a Person (static method).");
  }
}
