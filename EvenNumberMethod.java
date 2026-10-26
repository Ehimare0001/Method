//7. Write a Java program that checks whether a number is even using a method.

public class EvenNumberMethod { 

  public static void main(String[]args) {
  
    System.out.println(isEven(18));
    System.out.println(isEven(17));
  
  
  }

  public static boolean isEven(int number) { 
   return( number % 2 == 0);
  }
}
