package dev.ranieri.services;

import dev.ranieri.data.BookDAO;
import dev.ranieri.entities.Book;
import dev.ranieri.utilities.ArrayList;
import dev.ranieri.utilities.List;
import dev.ranieri.utilities.LogLevel;
import dev.ranieri.utilities.Logger;

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
        book.setReturnDate(0); // save the book in the database
        return this.bookDAO.updateBook(book);
    }

    @Override
    public Book retrieveBookById(int id) {
        return this.bookDAO.getBookById(id);
    }

    @Override
    public Book checkOut(Book book) {
        // when a book is Checked out it should have a return date of 2 weeks in the future
        book.setReturnDate(System.currentTimeMillis() + (14*24*60*60*1000));
        this.bookDAO.updateBook(book);// save the book in the database
        Logger.log("the book with ID "+ book.getId() + " was checked out", LogLevel.INFO);
        return book;
    }

    @Override
    public Book checkOut(int id) {
        Book book = this.bookDAO.getBookById(id);
        this.checkOut(book);
        Logger.log("the book with ID "+ book.getId() + " was checked in", LogLevel.INFO);
        return book;
    }

    @Override
    public List<Book> libraryCatalogue() {
        return this.bookDAO.getAllBooks();
    }

    @Override
    public boolean destroyBookById(int id) {
        boolean result = this.bookDAO.deleteBookById(id);
        return result;
    }

    @Override
    public Book replaceBook(Book book) {
        return this.bookDAO.updateBook(book);
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        List<Book> allBooks = this.bookDAO.getAllBooks();

        List<Book> filteredBooks = new ArrayList();

        for(int i =0; i< allBooks.size(); i++){
            if(allBooks.get(i).getTitle().equals(title)){
                filteredBooks.add(allBooks.get(i));
            }
        }

        return filteredBooks;
    }
}
