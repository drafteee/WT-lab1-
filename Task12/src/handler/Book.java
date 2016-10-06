package handler;

/**
 * Created by Сергей on 06.10.2016.
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Book book = (Book) o;

        if (price != book.price)
            return false;

        if (!title.equals(book.title))
            return false;

        return author.equals(book.author);

    }

    @Override
    public int hashCode() {
        int result = title.hashCode();

        result = 31 * result + author.hashCode();
        result = 31 * result + price;

        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
