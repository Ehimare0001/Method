//13. Write a Java program that checks whether a number is odd.

public class OddNumber {

  public static void main(String[]args) {
  
    System.out.println(isOdd(7));
    System.out.println(isOdd(8));
  }
  
  public static boolean isOdd(int number){ 
  
    return number % 2 != 0;
    
    }
  
  
  }


