//3. Write a Java program that uses one method to greet three people: John, Mary, and Peter.

public class MultipleGreetings {

  public static void main(String[]args) {
  
    greet("John");
    greet("Mary");
    greet("Peter");
  
  }

  public static void greet(String name) {
  
    System.out.println("Hello " + name);
  
  }
}
