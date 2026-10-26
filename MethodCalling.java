//9. Write a Java program that uses one method to calculate the square of a number and another method to perform multiplication.

public class MethodCalling{ 

  public static void main(String[]args) {
  
    System.out.println(square(5));
  
  
  }

  public static int square(int number){
  
    return number * number;
  }
  
  public static int multiply(int firstNumber, int secondNumber){
  
    return firstNumber * secondNumber;
  }
}
