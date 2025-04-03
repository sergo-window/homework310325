import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, yearPublication);
    }
}