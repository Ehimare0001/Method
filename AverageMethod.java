//5. Write a Java program that uses a method to calculate the average of two numbers.

public class AverageMethod{

  public static void main(String[]args) { 
  
    double answer = average(10, 11);
    
    System.out.println(answer);
  
   }
   
   public static double average(double firstNumber, double secondNumber){ 
   
      double result = (firstNumber + secondNumber)/2;
    
      return result;
   
   
   }

}
