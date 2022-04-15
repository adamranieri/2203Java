package dev.ranieri.services;

import dev.ranieri.entities.Book;
import dev.ranieri.utilities.List;

// Bussiness logic methods
// More bussinessy than pure CRUD operations
// Will use the DAO directly
public interface BookService {

    Book registerBook(Book book);

    Book checkIn(Book book);

    Book retrieveBookById(int id);

    Book checkOut(Book book);
    Book checkOut(int id);

    List<Book> libraryCatalogue();

    boolean destroyBookById(int id);

    Book replaceBook(Book book);

    List<Book> getBooksByTitle(String title);

}
