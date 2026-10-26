//10. Write a Java program containing two methods named add: one adds two numbers, and the other adds three numbers.

public class MethodOverloading{

  public static void main(String[]args) { 
  
    System.out.println(add(5, 8));
    System.out.println(add(5, 8, 7));
  
   }

  public static int add(int a, int b){ 
  
    return a + b;
  
  }
  
  public static int add(int a, int b, int c){ 
  
    return a + b + c;
  }
  
}
