import java.util.*;

public class Book {
    public static void main(String[]args){
StoryBook book=new StoryBook();

book.nameOfBook();
System.out.println("No of copies available = "+book.copies);

    }
    
}

class StoryBook{
    int copies=50;
public void nameOfBook(){
    System.out.println(" Beyond The Truth");
    copies -=1;
}
}