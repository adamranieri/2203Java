package dev.ranieri.data;

import dev.ranieri.entities.Book;

// DAO Data Access Object
// A class responsible for CRUD operations on the database
// FOR A SINGLE ENTITY
// 1 DAO per Entity
public interface BookDAO {
    // Create
    Book createBook(Book book);

    // Read
    Book getBookById(int id);

    //Update
    Book updateBook(Book book);

    //Delete
    boolean deleteBookById(int id);

}
