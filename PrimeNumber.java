//14. Write a method which takes in a integer and return true if it is a prime number

public class PrimeNumber {

  public static void main(String[]args) {
  
    System.out.println(isPrime(11));
    System.out.println(isPrime(4));
    System.out.println(isPrime(1));
    System.out.println(isPrime(21));
  
  
  }
  
  public static boolean isPrime(int number){
  
    if (number <= 1) {
      return false;
    
    }
    
    for(int divisor = 2; divisor < number; divisor++) {
    
      if(number % divisor == 0){ 
        return false;
      
      
      }
    
    
    }
    return true;

}

}
