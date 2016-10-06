package tests;

import handler.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Сергей on 06.10.2016.
 */
public class TestComparator {
    private Book[] booksArray=new Book[8];

    public void setUp() {
        booksArray[0]=new Book("Thinking in Java","Bruce Eckel",100,5);
        booksArray[1]=new Book("Harry Potter Part 2","Joanne Rowling",60,2);
        booksArray[2]=new Book("Sherlock Holmes and Dr Watson","Arthur Conan Doyle",100,5);
        booksArray[3]=new Book("Murder on the Orient Express","Agatha Christie",80,4);
        booksArray[4]=new Book("Harry Potter Part 1","Joanne Rowling",60,2);
        booksArray[5]=new Book("Adventure of Robinson Crusoe","Daniel Defo",90,7);
        booksArray[6]=new Book("Sherlock Holmes and Dr Watson","Conan Doyle",50,5);
        booksArray[7]=new Book("Murder on the Orient Express","Agatha Christie",70,4);
    }

    @Test
    public void sorted4BooksByTitle(){
        setUp();
        Book expectedBook=booksArray[5];
        Arrays.sort(booksArray,new Book.SortedByTitle());
        Book actualBook=booksArray[0];
        Assert.assertEquals(expectedBook,actualBook);
    }

    @Test
    public void sorted4BooksByTitleAndAuthor(){
        setUp();
        String expected="Conan Doyle";
        Arrays.sort(booksArray,new Book.SortedByTitleAndAuthor());
        Book actualBook=booksArray[6];
        Assert.assertEquals(expected,actualBook.getAuthor());
    }

    @Test
    public void sorted4BooksByAuthorAndTitle(){
        setUp();
        String expected="Harry Potter Part 1";
        Arrays.sort(booksArray,new Book.SortedByAuthorAndTitle());
        Book actualBook=booksArray[6];
        Assert.assertEquals(expected,actualBook.getTitle());
    }

    @Test
    public void sorted4BooksByAuthorAndTitleAndPrice(){
        setUp();
        Book expectedBook=booksArray[7];
        Arrays.sort(booksArray,new Book.SortedByAuthorAndTitleAndPrice());
        Book actualBook=booksArray[0];
        Assert.assertEquals(expectedBook,actualBook);
    }
}
