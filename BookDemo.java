class Book{
   int bookID;
   String title;
   String author;
   double price;
   static int total_books = 0;  //navu main class alli object create mado avashyakate ella
   Book(int bookID , String title , String author , double price){ //this. refers to the current object
      this.bookID = bookID;
      this.title = title;
      this.author = author;
      this.price = price;
      total_books++;
   }
   void display(){
      System.out.println("BookID:"+bookID);
      System.out.println("Title:"+title);
      System.out.println("Author:"+author);
      System.out.println("Prince:"+price);
   }
   void search(int id){
      if(bookID == bookID){
         System.out.println("Book is found");
      }
      else{
         System.out.println("Book not found");
      }
   }
   void search (String title){
      if(title == title){
         System.out.println("Book is found");
      }
      else{
         System.out.println("Book is not found");
      }
   }
   Book CostilerBook(Book other){
      if(price > other.price){
         return this;
      }
      else{
         return other;
      }
   }
}

public class BookDemo {
   public static void main(String [] args){
      Book b1 = new Book(101, "java programming", "James Gosling", 500);
      Book b2 = new Book(102, "Data Structure", "Mark Allen", 650);
      Book b3 = new Book(103, "Database System", "Raghu ramakrishna", 450);
      Book b4 = new Book(104, "Java Script", "Ranjana", 500);
      
      System.out.println("----Book Details----");
      b1.display();
      System.out.println();
      
      b2.display();
      System.out.println();
      
      b3.display();
      System.out.println();
      
      b4.display();
      
      System.out.println("\n---search by bookID---");
      b1.search(101);
      
      System.out.println("\n---search by title---");
      b2.search("Data Structure");
      
      System.out.println("\n---CostlierBook---");
      Book Costly = b1.CostilerBook(b2);
      
      System.out.println("Costlier Book:"+Costly.title);
      System.out.println("Price:"+Costly.price);
      
      System.out.println("\n Total number of books created:"+ Book.total_books);
   }
}
