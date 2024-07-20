package BookExplorerManager;
import BookExplorerManager.Books;
import BookExplorerManager.LLQueue;

public class Main {

   
    public static void main(String[] args) {
       
        Books Book1 = new Books("the little prenciess","Divid");
        Books Book2 = new Books("Dracola","Martin");
        Books Book3 = new Books("Matilda","Harry Styles");
        Books Book4 = new Books("country","KSA");
        Books Book5 = new Books("Shipment","Aramex");
        
        LLQueue<Books> AutherBooks = new LLQueue<>();

        AutherBooks.Enqueue(Book1);
        AutherBooks.Enqueue(Book2);
        AutherBooks.Enqueue(Book3);
        
        System.out.println("Authers books is: ");
        AutherBooks.Display();
        
       LLQueue<Books> MyTextBooks = new LLQueue<>(); 
       MyTextBooks.Enqueue(Book3);
       MyTextBooks.Enqueue(Book5);
       MyTextBooks.Enqueue(Book4);
       MyTextBooks.Enqueue(Book2);
       
        System.out.println("My Text Books is: ");
        MyTextBooks.Display();
        
        int count = 0;
        while ( ! AutherBooks.isEmpty()){
            Books Auther = AutherBooks.Dequeue();
            boolean isFound = MyTextBooks.find(Auther);
            ;
            if(isFound){
              MyTextBooks.RemoveAllEllemnetE(Auther); 
              count++;
            }
        }
        
       System.out.println("My Text Books is: ");
        MyTextBooks.Display();
        
        System.out.println("there are "+count+" books of MyTextBooks are found in AutherBooks."); 
    }
}