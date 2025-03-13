public class Book {
    private String title;
    private String author;

    public Book(Book book) {
        this(book.title, book.author);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println(
                "Title: " + this.title + ", Author: " + this.author);
    }

}
