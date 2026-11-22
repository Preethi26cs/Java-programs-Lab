class Rectangle{
   double length=10;
   double breadth=5;
   
   double area(){
      return length*breadth;
   }
}
public class RectangleDemo{
   public static void main(String [] args){
      Rectangle r = new Rectangle();
      
      System.out.println("Length = " + r.length);
      System.out.println("Breadth = " + r.breadth);
      System.out.println("Area of Rectangle = " + r.area());
   }
}