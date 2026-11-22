

class Student{
   String USN;
   String Name;
   
   void accept(String u, String n){
      USN = u;
      Name = n;
   }
   void display(){
      System.out.println("Student USN:" + USN);
      System.out.println("Student Name:" + Name);
   }
}
public class StudentDemo{
   public static void main(String [] args){
      Student s1 = new Student();
      Student s2 = new Student();
      Student s3 = new Student();
      
      s1.accept("1BM26CS568","preethi");
      s2.accept("1BM26CS570","shreesha");
      s3.accept("1BM26CS670","pallavi");
      
      s1.display();
      s2.display();
      s3.display();
   }
}
        