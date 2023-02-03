import java.util.*;

public abstract class BookPool {
public  static List<Book> free=new ArrayList<>();
public static List<Book> used=new ArrayList<>();

public static Book getBook(){
  if(free.isEmpty()){
      Book book=new Book("Book Thief",new Date(1/1/1),500);
      free.add(book);
      return book;
  } else {
      Book book=free.get(0);
      used.add(book);
      free.remove(book);
      return book;
  }
}
public static void releaseBook(Book book){
    used.remove(book);
    free.add(book);
}

}

