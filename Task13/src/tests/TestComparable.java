package tests;

import handler.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

/**
 * Created by Сергей on 06.10.2016.
 */
public class TestComparable {

    @Test
    public void TestComparableReturnFirstElement(){
        int expectedIsbn=1;
        TreeSet<Book> treeSetBooks = new TreeSet<Book>();
        treeSetBooks.add(new Book("Book1", "Chehov", 342, 1));
        treeSetBooks.add(new Book("Book2", "Lermontov", 543, 2));
        treeSetBooks.add(new Book("Book3", "Evdakov", 178, 3));
        treeSetBooks.add(new Book("Book4", "Pushkin", 283, 4));
        treeSetBooks.add(new Book("Book5", "Gogol", 495, 5));

        Assert.assertEquals(expectedIsbn,treeSetBooks.first().getIsbn());
    }

    @Test
    public void TestComparableReturnLastElement(){
        int expectedIsbn=5;
        TreeSet<Book> treeSetBooks = new TreeSet<Book>();
        treeSetBooks.add(new Book("Book1", "Chehov", 342, 1));
        treeSetBooks.add(new Book("Book2", "Lermontov", 543, 2));
        treeSetBooks.add(new Book("Book3", "Evdakov", 178, 3));
        treeSetBooks.add(new Book("Book4", "Pushkin", 283, 4));
        treeSetBooks.add(new Book("Book5", "Gogol", 495, 5));

        Assert.assertEquals(expectedIsbn,treeSetBooks.last().getIsbn());
    }
}
