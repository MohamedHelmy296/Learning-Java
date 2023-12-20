// Base class for LibraryItem
public class LibraryItem {
    private String title;
    private String author;
//Constructor
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {this.author = author;}
}