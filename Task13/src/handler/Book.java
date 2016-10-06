package handler;

import java.util.Comparator;

/**
 * Created by Сергей on 06.10.2016.
 */
public class Book implements Cloneable,Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public Book(String title,String author,int price,int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
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

    @Override
    public Book clone() {
        try {
            return (Book)super.clone();
        }
        catch(CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }

    @Override
    public int compareTo(Book book) {
        int result=1;
        if(book==null)
            return result;

        if((result=this.getIsbn()-book.getIsbn()) != 0)
            return result / Math.abs(result);
        return result;
    }

    public static class SortedByTitle implements Comparator<Book> {

        @Override
        public int compare(Book object1, Book object2) {

            if(object1==null && object2!=null)
                return 1;

            if(object1!=null && object2==null)
                return -1;

            return object1.getTitle().compareTo(object2.getTitle());
        }
    }

    public static class SortedByTitleAndAuthor implements  Comparator<Book>{

        @Override
        public int compare(Book object1, Book object2) {

            if(object1==null && object2!=null)
                return 1;

            if(object1!=null && object2==null)
                return -1;

            int compareResult=object1.getTitle().compareTo(object2.getTitle());

            if(compareResult==0)
                compareResult=object1.getAuthor().compareTo(object2.getAuthor());

            return compareResult;
        }
    }

    public static class SortedByAuthorAndTitle implements  Comparator<Book>{

        @Override
        public int compare(Book object1, Book object2) {

            if(object1==null && object2!=null)
                return 1;

            if(object1!=null && object2==null)
                return -1;

            int compareResult=object1.getAuthor().compareTo(object2.getAuthor());

            if(compareResult==0)
                compareResult=object1.getTitle().compareTo(object2.getTitle());

            return compareResult;
        }
    }

    public static class SortedByAuthorAndTitleAndPrice implements  Comparator<Book>{

        @Override
        public int compare(Book object1, Book object2) {

            if(object1==null && object2!=null)
                return 1;

            if(object1!=null && object2==null)
                return -1;

            int compareResult=object1.getAuthor().compareTo(object2.getAuthor());

            if(compareResult==0)
                compareResult=object1.getTitle().compareTo(object2.getTitle());

            if(compareResult==0)
                if(object1.getPrice()>object2.getPrice())
                    return 1;
                else if(object1.getPrice()<object2.getPrice())
                    return -1;

            return compareResult;
        }
    }
}
