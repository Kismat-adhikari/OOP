public class Book {
    private String title, author;
    private int year;
    private boolean available = true;

    public void setDetails(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void borrow() {
        if (available)
            available = false;
    }

    public boolean isAvailable() {
        return available;
    }
}