public class Book {
    private final String bookTitle;
    private final Author author;
    private int yearPublication;

    public Book(String bookTitle, Author author, int yearPublication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}