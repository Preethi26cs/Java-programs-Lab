class FibonacciWhileLoop{
   public static void main(String [] args){
      int n = 7;
      int FirstTerm = 0;
      int SecondTerm = 1;
      System.out.println("First " + n + " Terms of Fibonacci Series ");
      
      int i = 1;
      while (i<=n){
         System.out.println(FirstTerm + "");
         int nextTerm = FirstTerm + SecondTerm;
         FirstTerm = SecondTerm;
         SecondTerm = nextTerm;
         i++;
      }
   }
}