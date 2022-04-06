package dev.ranieri.services;

import dev.ranieri.data.BookDAO;
import dev.ranieri.entities.Book;
import dev.ranieri.utilities.List;

public class BookServiceImpl implements BookService{

    private BookDAO bookDAO;

    // Dependency Injection. Building an object that uses another object within it
    public BookServiceImpl(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    @Override
    public Book registerBook(Book book) {
        return this.bookDAO.createBook(book); // we are using the dao in our service to save the book
    }

    @Override
    public Book checkIn(Book book) {
        book.setReturnDate(0);
        this.bookDAO.updateBook(book);// save the book in the database
        return null;
    }

    @Override
    public Book checkOut(Book book) {
        // when a book is Checked out it should have a return date of 2 weeks in the future
        book.setReturnDate(System.currentTimeMillis() + (14*24*60*60*1000));
        this.bookDAO.updateBook(book);// save the book in the database
        return book;
    }

    @Override
    public Book checkOut(int id) {
        Book book = this.bookDAO.getBookById(id);
        this.checkOut(book);
        return book;
    }

    @Override
    public List<Book> libraryCatalogue() {
        return this.bookDAO.getAllBooks();
    }
}
