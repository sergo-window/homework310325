import java.util.Objects;

public class Author {
    private final String name;
    private final String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}