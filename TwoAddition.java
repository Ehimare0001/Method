//4. Write a Java program that uses a method to add two numbers and return the answer.

public class TwoAddition{ 

  public static void main(String[]args) {
  
    int answer = add(4, 6);
    
    System.out.println(answer);
   
  }
  
  public static int add(int a, int b) { 
  
    int sum = a + b;
    
    return sum;
  
  }
}




