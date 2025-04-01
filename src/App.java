public class App {
    public static void main(String[] args) {
        System.out.println("Library catalog");

        Author author1 = new Author("Alexander", "Pushkin");
        Author author2 = new Author("Mikhail", "Bulgakov");
        System.out.println("Автор 1: " + author1.getName() + " " + author1.getLastName());
        System.out.println("Автор 2: " + author2.getName() + " " + author2.getLastName());

        Book book1 = new Book("<<Eugene Onegin>>", author1, 1833);
        Book book2 = new Book("<<Master and Margarita>>", author2, 1967);
        book1.setYearPublication(1889);
        System.out.println("Книга 1: " + book1.getBookTitle() + ", Автор: " + book1.getAuthor() + ", Год: " + book1.getYearPublication());
        System.out.println("Книга 2: " + book2.getBookTitle() + ", Автор: " + book2.getAuthor() + ", Год: " + book2.getYearPublication());
    }
}