import java.util.Scanner;

class Publisher
{
  String publicationName;
  public Publisher(String publicationName)
  {
    this.publicationName = publicationName;
  }
}

class Book extends Publisher
{
  String title, author;

  public Book(String publisherName, String title, String author) {
    super(publisherName);
    this.title = title;
    this.author = author;
  }
  
}

class Litrature extends Book
{
  String litratureName;

  public Litrature(String publisherName, String title, String author, String litratureName) {
    super(publisherName, title, author);
    this.litratureName = litratureName;
  }
}

class Fiction extends Book
{
  String bookName;

  public Fiction(String publisherName, String title, String author, String bookName) {
    super(publisherName, title, author);
    this.bookName = bookName;
  }
  
}

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    
  }
}