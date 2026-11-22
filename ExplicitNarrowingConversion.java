public class ExplicitNarrowingConversion{
   public static void main(String [] args){
      double doubleValue = 99.50;
      System.out.println("Original double Value:" + doubleValue);
      
      int intValue = (int)doubleValue;
      System.out.println("After Explicit Conversion double->int:" + intValue);
   }
}