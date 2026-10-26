//12. Write a Java program that uses a method to return the larger of two integers.

public class LargestNumber{

  public static void main(String[]args){
  
    System.out.println(largest(56, 12));
  
  }

  public static int largest(int a, int b){ 
  
    if(a > b) {
      return a;
    
    
    }else{ 
      return b;
    
    }
  
  }
}
