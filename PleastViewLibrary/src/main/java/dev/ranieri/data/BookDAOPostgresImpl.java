package dev.ranieri.data;

import dev.ranieri.entities.Book;
import dev.ranieri.exceptions.ResourceNotFound;
import dev.ranieri.utilities.*;

import java.sql.*;

public class BookDAOPostgresImpl implements BookDAO{

    @Override
    public Book createBook(Book book) {
        // insert into book values (default, 'Cat''s Cradle', 'Kurt Vonegaut',0);
        try {
            Connection conn = ConnectionUtil.createConnection();
            String sql = "insert into book values (default,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, book.getTitle());// for the 1st question mark what is the value
            ps.setString(2, book.getAuthor());
            ps.setLong(3,book.getReturnDate());

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys(); // ResultSet a virtual table of results
            rs.next();// move to the first record of the result set
            int generatedId = rs.getInt("book_id");
            book.setId(generatedId);
            return book;

        } catch (SQLException e) {
            e.printStackTrace();
            Logger.log(e.getMessage(), LogLevel.ERROR);
            return null;
        }

    }

    @Override
    public Book getBookById(int id) {

        try {
            Connection conn = ConnectionUtil.createConnection();
            String sql = "select * from book where book_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();

            if(rs.getFetchSize() == 0){
                throw new ResourceNotFound(id);
            }

            rs.next(); // move to first record
            Book book = new Book();
            book.setId(rs.getInt("book_id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setReturnDate(rs.getLong("return_date"));
            return book;

        } catch (SQLException e) {
            e.printStackTrace();
            Logger.log(e.getMessage(), LogLevel.ERROR);
            return null;
        }

    }

    @Override
    public List<Book> getAllBooks() {
        try {
            Connection conn = ConnectionUtil.createConnection();
            String sql = "select * from book";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<Book> books = new ArrayList();
            while (rs.next()){
                Book book = new Book();
                book.setId(rs.getInt("book_id"));
                book.setTitle(rs.getString("title"));
                book.setAuthor(rs.getString("author"));
                book.setReturnDate(rs.getLong("return_date"));
                books.add(book);
            }

        return books;

        } catch (SQLException e) {
            e.printStackTrace();
            Logger.log(e.getMessage(), LogLevel.ERROR);
            return null;
        }
    }

    @Override
    public Book updateBook(Book book) {

        try {
            Connection conn = ConnectionUtil.createConnection();
            String sql = "update book set title = ?, author = ?, return_date = ? where book_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setLong(3, book.getReturnDate());
            ps.setInt(4, book.getId());
            int rowsUpdated = ps.executeUpdate();

            if(rowsUpdated == 0){
                throw new ResourceNotFound(book.getId());
            }

            return  book;

        } catch (SQLException e) {
            e.printStackTrace();
            return  null;
        }

    }

    @Override
    public boolean deleteBookById(int id) {

        try {
            Connection conn = ConnectionUtil.createConnection();
            String sql = "delete from book where book_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return  true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }


    }
}
