public class Book {
    String Title ;
    String Author ;

    public Book(String title, String author) {
        Title = title;
        Author = author;
    }

    public void display() {
        System.out.println("موضوع"+Title+"نویسنده"+Author);

    }

}
