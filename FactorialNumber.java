//15. Write a Java program that uses a method to calculate the factorial of a number.

public class FactorialNumber{

  public static void main(String[]args) { 
  
    System.out.println(factorial(7));
    
  }
  
  public static int factorial(int number) {
  
    int result = 1;
    
    for(int index = 1; index <= number; index++) { 
    
      result = result * index;
    
    
    }
    
    return result;
  
  }


}
