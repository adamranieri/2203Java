package dev.ranieri.daotests;

import dev.ranieri.data.BookDAO;
import dev.ranieri.data.BookDAOPostgresImpl;
import dev.ranieri.entities.Book;
import dev.ranieri.utilities.List;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)// to run tests in order
public class BookDaoTests {

    static BookDAO bookDAO = new BookDAOPostgresImpl();
    static Book testBook = null;

    @Test
    @Order(1) // JUnit does not run tests in order by default
    void create_book_test(){
        // An entity that is created but not yet saved should have an id of 0
        // once saved that book should be some non-zero value
        Book frankenstein = new Book(0,"Frankenstein","Mary Shelley", 0);
        Book savedBook = bookDAO.createBook(frankenstein);
        BookDaoTests.testBook = savedBook;// I have a book I can use in other tests
        Assertions.assertNotEquals(0,savedBook.getId());
    }

    @Test
    @Order(2)
    void get_book_by_id(){
        Book retrievedBook  = bookDAO.getBookById(testBook.getId());// use the id generated from the previous test
        // I have avoided hard coded values and made my test repeatable
        System.out.println(retrievedBook);
        Assertions.assertEquals("Frankenstein", retrievedBook.getTitle());
    }

    @Test
    @Order(3)
    void update_book(){
        BookDaoTests.testBook.setTitle("Frankenstein 2: Electric Boogaloo");
        bookDAO.updateBook(testBook);// the new title should be saved to the database
        Book retrievedBook = bookDAO.getBookById(testBook.getId());
        Assertions.assertEquals("Frankenstein 2: Electric Boogaloo",retrievedBook.getTitle());
    }

    @Test
    @Order(4)// to not run something
    void delete_book(){
        boolean result = bookDAO.deleteBookById(testBook.getId()); // true if successful
        Assertions.assertTrue(result);
    }

    @Test
    @Order(5)
    void get_all_books(){
        Book a = new Book(0,"A","B",0);
        Book b = new Book(0,"A","B",0);
        Book c = new Book(0,"A","B",0);
        bookDAO.createBook(a);
        bookDAO.createBook(b);
        bookDAO.createBook(c);
        List<Book> books = bookDAO.getAllBooks();
        int totalBooks = books.size(); // if list did not work and was not tested this might fail regardless
        Assertions.assertTrue(totalBooks >= 3);
    }

}
