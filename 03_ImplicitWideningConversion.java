public class ImplicitWideningConversion{
   public static void main(String [] args){
      int intValue = 100;
      System.out.println("Original int Value:" + intValue);
      
      long longValue = intValue;
      System.out.println("After Implicit Conversion int->long:" + longValue);
      
      double doubleValue = intValue;
      System.out.println("After Implicit Conversion int->double:" + doubleValue);
   }
}
